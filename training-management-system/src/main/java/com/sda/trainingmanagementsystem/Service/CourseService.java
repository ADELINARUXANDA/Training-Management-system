package com.sda.trainingmanagementsystem.Service;

import com.sda.trainingmanagementsystem.Dto.CourseDto;
import com.sda.trainingmanagementsystem.Dto.UserDto;

import java.util.List;

public interface CourseService {
    List<CourseDto> getCourses();
    CourseDto findCourse(Long id);
    void deleteCourse(Long id);
    void updateCourse(CourseDto courseDto);
    void addCourse(CourseDto courseDto);
    CourseDto findCourseByName(CourseDto courseDto);
    CourseDto findCourseByClassUnit(CourseDto courseDto);
}
