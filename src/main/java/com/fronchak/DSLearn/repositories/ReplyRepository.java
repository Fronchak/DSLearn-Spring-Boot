package com.fronchak.DSLearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fronchak.DSLearn.entities.Reply;

@Repository
public interface ReplyRepository extends JpaRepository<Reply, Long> {

}
