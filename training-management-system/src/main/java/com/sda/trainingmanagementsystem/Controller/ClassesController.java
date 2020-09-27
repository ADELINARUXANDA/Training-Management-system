package com.sda.trainingmanagementsystem.Controller;

import com.sda.trainingmanagementsystem.Dto.ClassesDto;
import com.sda.trainingmanagementsystem.Service.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin("http://localhost:4200")
public class ClassesController {

    @Autowired
    private ClassesService classesService;

    @GetMapping("findClasses")
    public ResponseEntity<List<ClassesDto>> findClasses() {
        List<ClassesDto> classesDtoList = classesService.findClasses();
        return new ResponseEntity(classesDtoList, HttpStatus.OK);
    }

    @DeleteMapping("deleteClass/{id}")
    public ResponseEntity deleteClass(@PathVariable("id") Long id) {
       String message = classesService.deleteClass(id);
        return new ResponseEntity(message, HttpStatus.OK);
    }

    @PostMapping("addClass")
    public ResponseEntity addClass(@RequestBody ClassesDto classesDto) {
        classesService.addClass(classesDto);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("findClassesById/{id}")
    public ResponseEntity<ClassesDto> findClassesById(@PathVariable("id") Long id) {
        ClassesDto classesDto = classesService.findClassesById(id);
        return new ResponseEntity(classesDto, HttpStatus.OK);

    }

    @PutMapping("editClass")
    public ResponseEntity updateClass(@RequestBody ClassesDto classesDto) {
        classesService.updateClass(classesDto);
        return new ResponseEntity(HttpStatus.OK);
    }
}
