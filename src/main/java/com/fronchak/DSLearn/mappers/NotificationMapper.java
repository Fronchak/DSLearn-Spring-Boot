package com.fronchak.DSLearn.mappers;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.fronchak.DSLearn.dtos.notification.NotificationOutputDTO;
import com.fronchak.DSLearn.entities.Notification;

@Service
public class NotificationMapper {

	public NotificationOutputDTO convertEntityToOutputDTO(Notification entity) {
		NotificationOutputDTO dto = new NotificationOutputDTO();
		dto.setId(entity.getId());
		dto.setMoment(entity.getMoment());
		dto.setRead(entity.isRead());
		dto.setRoute(entity.getRoute());
		dto.setText(entity.getText());
		dto.setUserId(entity.getUser().getId());
		return dto;
	}
	
	public Page<NotificationOutputDTO> convertEntityPageToOutputDTOPage(Page<Notification> page) {
		return page.map(entity -> convertEntityToOutputDTO(entity));
	}
}
