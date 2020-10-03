package com.sda.trainingmanagementsystem.Controller;


import com.sda.trainingmanagementsystem.Dto.ClassUnitDto;
import com.sda.trainingmanagementsystem.Dto.ClassesDto;
import com.sda.trainingmanagementsystem.Service.ClassUnitService;
import com.sda.trainingmanagementsystem.Service.ClassesService;
import com.sda.trainingmanagementsystem.model.ClassUnitModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class ClassUnitController {

    @Autowired
    private ClassUnitService classUnitService;

    @GetMapping("findClassesUnits")
    public ResponseEntity<List<ClassesDto>> findClassesUnit() {
        List<ClassUnitModel> classUnitDtoList = classUnitService.findClassesUnit();
        return new ResponseEntity(classUnitDtoList, HttpStatus.OK);
    }

    @DeleteMapping("deleteClassUnit/{id}")
    public ResponseEntity deleteClass(@PathVariable("id") Long id) {
        String message = classUnitService.deleteClassUnit(id);
        return new ResponseEntity(message, HttpStatus.OK);
    }

    @PostMapping("addClassUnit")
    public ResponseEntity addClassUnit(@RequestBody ClassUnitDto classUnitDto) {
        classUnitService.addClassUnit(classUnitDto);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("getClassUnit/{id}")
    public ResponseEntity<ClassesDto> findClassUnitById(@PathVariable("id") Long id) {
        ClassUnitDto classUnitDto = classUnitService.findClassUnitById(id);
        return new ResponseEntity(classUnitDto, HttpStatus.OK);

    }

    @PutMapping("editClassUnit")
    public ResponseEntity updateClass(@RequestBody ClassUnitDto classUnitDto) {
        classUnitService.updateClassUnit(classUnitDto);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping("asociationClassAtClassUnit/{id_ClassUnit,id_class }")
    public ResponseEntity asociationClassAtClassUnit(Long id_ClassUnit, Long id_class) {
        classUnitService.asociationClassAtClassUnit(id_ClassUnit, id_class);
        return new ResponseEntity(HttpStatus.OK);
    }
}