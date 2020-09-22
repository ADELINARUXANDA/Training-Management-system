package com.sda.trainingmanagementsystem.Service;

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
    private  CourseDto courseDto;

    @Override
    public List<CourseDto> getCourses() {


        List<CourseModel> courseList = CourseRepository.
        List<CourseDto> courseDtoList = new ArrayList<>();

        for (CourseModel course : courseList) {
            CourseDto courseDto = new CourseDto();
            courseDto.setId(course.getId());
            courseDto.setName(course.getName());
            courseDto.setParticipantRegistration(course.getParticipantRegistration());
            courseDto.setClassUnits(course.getClassUnits());
            courseDtoList.add(courseDto);
        }
        return courseDtoList;
    }

    @Override
    public CourseDto findCourse(Long id) {
        Optional<CourseModel> courseModelOptional= CourseRepository.
                if (courseModelOptional.isPresent())
                {
                  CourseModel courseModelFind = courseModelOptional.get();
                  CourseDto courseDtoFind = new CourseDto();
                  courseDtoFind.setId(courseModelFind.getId());
                  courseDtoFind.setName(courseModelFind.getName());
                  courseDtoFind.setClassUnits(courseModelFind.getClassUnits());
                  courseDtoFind.setParticipantRegistration(courseModelFind.getParticipantRegistration());

               return courseDtoFind;
    }

    @Override
    public void deleteCourse(Long id) {



    }

    @Override
    public void updateCourse(CourseDto courseDto) {
Optional<CourseModel> courseModelOptional = CourseRepository.

    }

    @Override
    public void addCourse(CourseDto courseDto) {
       CourseModel courseModel = new CourseModel();
       courseModel.setId(courseDto.getId());
       courseModel.setName(courseDto.getName());
       courseModel.setClassUnits(courseDto.getClassUnits());
       courseModel.setParticipantRegistration(courseDto.getParticipantRegistration());
       CourseRepository.

        }

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
