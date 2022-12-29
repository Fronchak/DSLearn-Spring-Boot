package com.fronchak.DSLearn.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fronchak.DSLearn.dtos.notification.NotificationOutputDTO;
import com.fronchak.DSLearn.services.NotificationService;

@RestController
@RequestMapping(value = "/notifications")
public class NotificationController {

	@Autowired
	private NotificationService service;
	
	@GetMapping
	public ResponseEntity<Page<NotificationOutputDTO>> getPagedNotifications(Pageable pageable) {
		Page<NotificationOutputDTO> page = service.getNotificationsForCurrentUser(pageable);
		return ResponseEntity.ok().body(page);
	}
}
