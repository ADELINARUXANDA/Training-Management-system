package com.sda.trainingmanagementsystem.Service;

import com.sda.trainingmanagementsystem.Dto.ClassUnitDto;
import com.sda.trainingmanagementsystem.Dto.CourseDto;

import java.util.List;

public interface CourseService {
    List<CourseDto> getCourses();
    CourseDto findCourse(Long id);
    String deleteCourse(Long id);
    void updateCourse(CourseDto courseDto);
    void addCourse(CourseDto courseDto);
    CourseDto findCourseByName(String name);
    CourseDto findCourseByClassUnit(ClassUnitDto classUnitDto);
    public void asociationClassUnitACourse(Long id_ClassUnit, Long id_Course);
}
