package com.fronchak.DSLearn.mappers;

import org.springframework.stereotype.Service;

import com.fronchak.DSLearn.dtos.delivery.DeliverRevisionDTO;
import com.fronchak.DSLearn.entities.Deliver;

@Service
public class DeliverMapper {

	public void copyDTOToEntity(DeliverRevisionDTO dto, Deliver entity) {
		entity.setStatus(dto.getStatus());
		entity.setFeedback(dto.getFeedback());
		entity.setCorrectCount(dto.getCorrectCount());
	}
}
