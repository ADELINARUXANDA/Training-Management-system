package com.sda.trainingmanagementsystem.Controller;

import com.sda.trainingmanagementsystem.Dto.ClassUnitDto;
import com.sda.trainingmanagementsystem.Dto.ClassesDto;
import com.sda.trainingmanagementsystem.Dto.CourseDto;
import com.sda.trainingmanagementsystem.Service.ClassUnitService;
import com.sda.trainingmanagementsystem.Service.CourseService;
import com.sda.trainingmanagementsystem.model.ClassUnitModel;
import com.sda.trainingmanagementsystem.model.CourseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("findCourses")
    public ResponseEntity<List<ClassesDto>> getCourses() {
        List<CourseDto> courseDtoList = courseService.getCourses();
        return new ResponseEntity(courseDtoList, HttpStatus.OK);
    }

    @DeleteMapping("deleteCourse/{id}")
    public ResponseEntity deleteCourse(@PathVariable("id") Long id) {
        String message = courseService.deleteCourse(id);
        return new ResponseEntity(message, HttpStatus.OK);
    }

    @PostMapping("addCourse")
    public ResponseEntity addClassUnit(@RequestBody CourseDto courseDto) {
        courseService.addCourse(courseDto);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("getCourse/{id}")
    public ResponseEntity<ClassesDto> findCourse(@PathVariable("id") Long id) {
        CourseDto courseDto = courseService.findCourse(id);
        return new ResponseEntity(courseDto, HttpStatus.OK);

    }

    @PutMapping("editCourse")
    public ResponseEntity updateClass(@RequestBody CourseDto courseDto) {
        courseService.updateCourse(courseDto);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping("asociationClassUnitACourse/{id_ClassUnit,id_Course }")
    public ResponseEntity asociationClassUnitACourse(Long id_ClassUnit, Long id_Course){
        courseService.asociationClassUnitACourse(id_ClassUnit, id_Course);
        return new ResponseEntity(HttpStatus.OK);

    }
}
