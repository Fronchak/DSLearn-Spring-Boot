package com.fronchak.DSLearn.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fronchak.DSLearn.entities.User;
import com.fronchak.DSLearn.exceptions.ForbiddenException;
import com.fronchak.DSLearn.exceptions.UnauthorizedException;
import com.fronchak.DSLearn.repositories.UserRepository;

@Service
public class AuthService {

	@Autowired
	private UserRepository repository;
	
	@Transactional(readOnly = true)
	public User authenticated() {
		try {
			String username = SecurityContextHolder.getContext().getAuthentication().getName();
			return repository.findByEmail(username);
		}
		catch(Exception e) {
			throw new UnauthorizedException("Invalid user");
		}
	}
	
	public void validateSelfOrAdmin(Long userId) {
		User user = authenticated();
		if(isNotLoggedUserOrSomeAdmin(user, userId)) {
			throw new ForbiddenException("Access denied");
		}
	}
	
	private boolean isNotLoggedUserOrSomeAdmin(User authenticatedUser, Long userId) {
		return !authenticatedUser.getId().equals(userId) && authenticatedUser.isNotAdmin();
	}
}
