package com.sda.trainingmanagementsystem.Service;

import com.sda.trainingmanagementsystem.Dto.ClassUnitDto;
import com.sda.trainingmanagementsystem.Dto.CourseDto;
import com.sda.trainingmanagementsystem.Repository.CourseRepository;
import com.sda.trainingmanagementsystem.model.CourseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<CourseDto> getCourses() {


        List<CourseModel> courseList = courseRepository.findAll();
        List<CourseDto> courseDtoList = new ArrayList<>();

        for (CourseModel course : courseList) {
            CourseDto courseDto = new CourseDto();
            courseDto.setId(course.getId());
            courseDto.setName(course.getName());
            courseDto.setParticipantRegistrationDto(course.getParticipantRegistration());
            courseDto.setClassUnitsDto(course.getClassUnits());
            courseDtoList.add(courseDto);
        }
        return courseDtoList;
    }

    @Override
    public CourseDto findCourse(Long id) {
        Optional<CourseModel> courseModelOptional = courseRepository.findById(id);
        if (courseModelOptional.isPresent()) {
            CourseModel courseModelFind = courseModelOptional.get();
            CourseDto courseDtoFind = new CourseDto();
            courseDtoFind.setId(courseModelFind.getId());
            courseDtoFind.setName(courseModelFind.getName());
            courseDtoFind.setClassUnitsDto(courseModelFind.getClassUnits());
            courseDtoFind.setParticipantRegistrationDto(courseModelFind.getParticipantRegistration());

            return courseDtoFind;

        }
        return null;
    }


    @Override
    public void deleteCourse(Long id) {
      courseRepository.deleteById(id);
    }

    @Override
    public void updateCourse(CourseDto courseDto) {
     Optional<CourseModel> courseOptional = courseRepository.findById(courseDto.getId());
     if(courseOptional.isPresent()){
        CourseModel courseModelFind = courseOptional.get();
        courseModelFind.setId(courseDto.getId());
        courseModelFind.setName(courseDto.getName());
        courseModelFind.setParticipantRegistration(courseDto.getParticipantRegistrationDto());
        courseModelFind.setClassUnits(courseDto.getClassUnitsDto());
     }

    }

    @Override
    public void addCourse(CourseDto courseDto) {
     CourseModel courseModel = new CourseModel();
     courseModel.setId(courseDto.getId());
     courseModel.setName(courseDto.getName());
     courseModel.setParticipantRegistration(courseDto.getParticipantRegistrationDto());
     courseModel.setClassUnits(courseDto.getClassUnitsDto());
    }


    @Override
    public CourseDto findCourseByName(String name) {
        CourseDto courseModelOptional = findCourseByName(name);
        if (courseModelOptional.getName().contains(name)) {
            String courseModelFind = courseModelOptional.getName();
            CourseDto courseDtoFind = new CourseDto();
            courseDtoFind.setName(courseModelFind);
            return courseDtoFind;
        }
        return null;
    }
    @Override
    public CourseDto findCourseByClassUnit(ClassUnitDto classUnitDto) {

        return null;
    }
}
