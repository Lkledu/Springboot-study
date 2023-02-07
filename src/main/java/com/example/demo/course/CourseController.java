package com.example.demo.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;

    @RequestMapping("/topic/{id}/courses")
    public List<Course> getAllCourses(@PathVariable String id){
        return courseService.getAllCourses(id);
    }

    @RequestMapping("/topic/{topicId}/course/{id}")
    public Course getCourse(String id){
        return courseService.getCourse(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/course")
    public void addCourse(@RequestBody Course course){
        courseService.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/course")
    public void updateCourse(@RequestBody Course course){
        courseService.updateCourse(course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/course/{id}")
    public void deletecourse(@PathVariable String id){
        courseService.deleteCourse(id);
    }

}
