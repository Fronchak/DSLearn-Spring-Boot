package com.fronchak.DSLearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fronchak.DSLearn.entities.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {

}
