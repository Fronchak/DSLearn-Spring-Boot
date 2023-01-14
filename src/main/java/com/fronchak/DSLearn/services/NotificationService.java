package com.fronchak.DSLearn.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fronchak.DSLearn.dtos.notification.NotificationOutputDTO;
import com.fronchak.DSLearn.entities.Notification;
import com.fronchak.DSLearn.entities.User;
import com.fronchak.DSLearn.mappers.NotificationMapper;
import com.fronchak.DSLearn.repositories.NotificationRepository;

@Service
public class NotificationService {

	@Autowired
	private NotificationRepository repository;
	
	@Autowired
	private NotificationMapper mapper;
	
	@Autowired
	private AuthService authService;
	
	@Transactional(readOnly = true)
	public Page<NotificationOutputDTO> getNotificationsForCurrentUser(boolean unreadOnly, Pageable pageable) {
		User user = authService.authenticated();
		Page<Notification> page = repository.find(user, unreadOnly, pageable);
		return mapper.convertEntityPageToOutputDTOPage(page);
	}
}
