package com.javajourney.learnspringboot.courses.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javajourney.learnspringboot.courses.bean.Course;
import com.javajourney.learnspringboot.courses.repository.CourseRepository;

@RestController // Tells this class is Spring MVC controller that handles incoming HTTP requests and produces the response 
public class CourseContents {
    // When a GET request is made to "/courses", the getAllCourses() method will be invoked.
    // to map the method getAllCourses() to handle HTTP GET requests with the path "/courses". 

    @Autowired
    private CourseRepository repository;
    @GetMapping("/courses") 
    public List<Course> getAllCourses() {
        return repository.findAll();
    }

    // GET  - Get info of the required id
    @GetMapping("/courses/{id}") 
    public Course getCourseDetails(@PathVariable long id) {
        Optional<Course> course = repository.findById(id);

        if (course.isEmpty()) {
            throw new RuntimeException("Course not found with id: " + id);
        }
        return course.get();
    }

    // POST - Create new Course in (/courses)
    @PostMapping("/courses")
    public void createCourse(@RequestBody Course course) {
        repository.save(course);
    }

    // PUT - Update Course in (/courses/id)
    @PutMapping("/courses/{id}")
    public void updateCourse(@PathVariable long id, @RequestBody Course course) {
        repository.save(course);
    }

    // DELETE - DELETE Course in (/courses/id)
    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable long id) {
        repository.deleteById(id);
    }

}
