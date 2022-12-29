package com.fronchak.DSLearn.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fronchak.DSLearn.dtos.user.UserOutputDTO;
import com.fronchak.DSLearn.entities.User;
import com.fronchak.DSLearn.exceptions.ResourceNotFoundException;
import com.fronchak.DSLearn.mappers.UserMapper;
import com.fronchak.DSLearn.repositories.UserRepository;

@Service
public class UserService implements UserDetailsService {

	private static Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserRepository repository;
	
	@Autowired
	private UserMapper mapper;
	
	@Autowired
	private AuthService authService;
	
	@Transactional(readOnly = true)
	public UserOutputDTO findById(Long id) {
		authService.validateSelfOrAdmin(id);
		User entity = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("User", id.toString()));
		return mapper.convertEntityToOutputDTO(entity);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = repository.findByEmail(username);
		if(user == null) {
			logger.error("User not found: " + username);
			throw new UsernameNotFoundException("Username not found: " + username);
		}
		logger.info("User found: " + username);
		return user;
	}
}
