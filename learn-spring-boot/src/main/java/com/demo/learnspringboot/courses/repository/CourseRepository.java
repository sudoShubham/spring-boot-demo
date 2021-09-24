package com.demo.learnspringboot.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.learnspringboot.courses.bean.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
