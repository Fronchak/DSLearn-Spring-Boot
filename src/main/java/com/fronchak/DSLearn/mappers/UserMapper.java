package com.fronchak.DSLearn.mappers;

import org.springframework.stereotype.Service;

import com.fronchak.DSLearn.dtos.user.UserOutputDTO;
import com.fronchak.DSLearn.entities.User;

@Service
public class UserMapper {

	public UserOutputDTO convertEntityToOutputDTO(User entity) {
		UserOutputDTO dto = new UserOutputDTO();
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		dto.setEmail(entity.getEmail());
		return dto;
	}
}
