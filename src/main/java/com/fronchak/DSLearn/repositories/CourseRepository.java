package com.fronchak.DSLearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fronchak.DSLearn.entities.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
