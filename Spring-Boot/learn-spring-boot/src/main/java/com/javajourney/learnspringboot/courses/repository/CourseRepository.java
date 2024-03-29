package com.javajourney.learnspringboot.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javajourney.learnspringboot.courses.bean.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
    
}
