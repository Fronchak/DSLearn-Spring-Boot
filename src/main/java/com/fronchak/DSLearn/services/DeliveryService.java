package com.fronchak.DSLearn.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fronchak.DSLearn.dtos.delivery.DeliverRevisionDTO;
import com.fronchak.DSLearn.entities.Deliver;
import com.fronchak.DSLearn.mappers.DeliverMapper;
import com.fronchak.DSLearn.repositories.DeliverRepository;

@Service
public class DeliveryService {

	@Autowired
	private DeliverRepository repository;
	
	@Autowired
	private DeliverMapper mapper;

	@Transactional
	public void saveRevision(Long id, DeliverRevisionDTO dto) {
		Deliver entity = repository.getReferenceById(id);
		mapper.copyDTOToEntity(dto, entity);
		repository.save(entity);
	}
}
