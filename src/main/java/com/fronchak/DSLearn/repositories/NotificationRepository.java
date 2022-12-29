package com.fronchak.DSLearn.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fronchak.DSLearn.entities.Notification;
import com.fronchak.DSLearn.entities.User;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {

	Page<Notification> findByUser(User user, Pageable pageable);
}
