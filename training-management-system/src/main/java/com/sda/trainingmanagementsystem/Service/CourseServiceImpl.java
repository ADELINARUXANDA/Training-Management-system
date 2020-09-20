package com.sda.trainingmanagementsystem.Service;

import com.sda.trainingmanagementsystem.Dto.CourseDto;
import com.sda.trainingmanagementsystem.Repository.CourseRepository;
import com.sda.trainingmanagementsystem.model.Course;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class CourseServiceImpl implements CourseService {

    private CourseRepository courseRepository;


    @Override
    public List<CourseDto> getCourses() {
        return null;
    }

    @Override
    public CourseDto findCourse(Long id) {
        return null;
    }

    @Override
    public void deleteCourse(Long id) {

    }

    @Override
    public void updateCourse(CourseDto courseDto) {

    }

    @Override
    public void addCourse(CourseDto courseDto) {

    }

    @Override
    public CourseDto findCourseByName(CourseDto courseDto) {
        return null;
    }

    @Override
    public CourseDto findCourseByClassUnit(CourseDto courseDto) {
        return null;
    }
}
