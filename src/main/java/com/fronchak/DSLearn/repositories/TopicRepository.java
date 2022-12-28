package com.fronchak.DSLearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fronchak.DSLearn.entities.Topic;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Long> {

}
