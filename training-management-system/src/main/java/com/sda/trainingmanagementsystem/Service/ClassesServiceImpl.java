package com.sda.trainingmanagementsystem.Service;

import com.sda.trainingmanagementsystem.Dto.ClassesDto;
import com.sda.trainingmanagementsystem.Repository.ClassesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClassesServiceImpl implements ClassesService{
@Autowired
    private ClassesRepository classesRepository;
    private ClassesDto classesDto;
    private ClassModel classModel;

    public <ClassModel> ClassesDto getClass(Long id) {
        Optional<ClassesRepository> ClassOptional = classesRepository.findById(id);
          if(ClassOptional.isPresent()){
              ClassModel classModel= (ClassModel) ClassOptional.get();

          }
    }  }

