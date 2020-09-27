package com.sda.trainingmanagementsystem.Service;

import com.sda.trainingmanagementsystem.Dto.ClassUnitDto;
import com.sda.trainingmanagementsystem.Dto.ClassesDto;
import com.sda.trainingmanagementsystem.Dto.CourseDto;
import com.sda.trainingmanagementsystem.Repository.ClassUnitRepository;
import com.sda.trainingmanagementsystem.Repository.CourseRepository;
import com.sda.trainingmanagementsystem.model.ClassUnitModel;
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
    private ClassUnitRepository classUnitRepository;

    @Override
    public List<CourseDto> getCourses() {


        List<CourseModel> courseList = courseRepository.findAll();
        List<CourseDto> courseDtoList = new ArrayList<>();

        for (CourseModel course : courseList) {
            CourseDto courseDto = new CourseDto();
            courseDto.setId(course.getId());
            courseDto.setName(course.getName());
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

            return courseDtoFind;

        }
        return null;
    }


    @Override
    public String deleteCourse(Long id) {
      courseRepository.deleteById(id);
        return null;
    }

    @Override
    public void updateCourse(CourseDto courseDto) {
     Optional<CourseModel> courseOptional = courseRepository.findById(courseDto.getId());
     if(courseOptional.isPresent()){
        CourseModel courseModelFind = courseOptional.get();
        courseModelFind.setId(courseDto.getId());
        courseModelFind.setName(courseDto.getName());
        courseRepository.save(courseModelFind);
     }

    }

    @Override
    public void addCourse(CourseDto courseDto) {
     CourseModel courseModel = new CourseModel();
     courseModel.setId(courseDto.getId());
     courseModel.setName(courseDto.getName());
     courseRepository.save(courseModel);
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
    public void asociationClassUnitACourse(Long id_ClassUnit, Long id_Course){
        Optional<CourseModel> courseModelOptional = courseRepository.findById(id_Course);
        if(courseModelOptional.isPresent()){
            CourseModel courseModelFind = courseModelOptional.get();
            courseModelFind.setId(id_ClassUnit);
            courseRepository.save(courseModelFind);

        }

    }
    public void asociationClassUnitAtCourse(Long id_ClassUnit, Long id_Course){
        Optional<ClassUnitModel> classUnitModelOptional = classUnitRepository.findById(id_ClassUnit);
        if(classUnitModelOptional.isPresent()){
            ClassUnitModel classUnitModelFind = classUnitModelOptional.get();
            CourseModel courseModel = new CourseModel();
           courseModel.setId(classUnitModelFind.getId());
           courseRepository.save(courseModel);

        }

    }
}
