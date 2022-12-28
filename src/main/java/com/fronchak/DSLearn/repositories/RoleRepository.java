package com.fronchak.DSLearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fronchak.DSLearn.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
