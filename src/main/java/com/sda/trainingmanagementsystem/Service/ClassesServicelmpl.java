package com.sda.trainingmanagementsystem.Service;


import com.sda.trainingmanagementsystem.Dto.ClassesDto;
import com.sda.trainingmanagementsystem.Repository.ClassesRepository;
import com.sda.trainingmanagementsystem.model.ClassUnitModel;
import com.sda.trainingmanagementsystem.model.ClassesModel;
import com.sda.trainingmanagementsystem.model.CourseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClassesServicelmpl implements ClassesService{

    @Autowired
    private ClassesRepository classesRepository;

    @Override
    public List<ClassesDto> findClasses() {
        List<ClassesModel> classesModelList = classesRepository.findAll();
        List<ClassesDto> classesDtoList =new ArrayList<>();
        for(ClassesModel classesModel: classesModelList){
            ClassesDto classesDto = new ClassesDto();
            classesDto.setId(classesModel.getId());
            classesDto.setDate(classesModel.getDate());
            classesDto.setSubject(classesModel.getSubject());
            classesDtoList.add(classesDto);
        }

        return classesDtoList;
    }

    @Override
    public ClassesDto findClassesById(Long id) {
        Optional<ClassesModel> classesModelOptional = classesRepository.findById(id);
        if(classesModelOptional.isPresent()){
            ClassesModel classesFind = classesModelOptional.get();
            ClassesDto classesDto = new ClassesDto();
            classesDto.setId(classesFind.getId());
            classesDto.setDate(classesFind.getDate());
            classesDto.setSubject(classesFind.getSubject());
            return classesDto;
        }

        return null;
    }

    @Override
    public String deleteClass(Long id) {
        classesRepository.deleteById(id);

        return null;
    }

    @Override
    public void updateClass(ClassesDto classesDto) {
        Optional<ClassesModel> classesModelOptional = classesRepository.findById(classesDto.getId());
        if (classesModelOptional.isPresent()){
            ClassesModel classesModelFind = classesModelOptional.get();
            classesModelFind.setId(classesDto.getId());
            classesModelFind.setDate(classesDto.getDate());
            classesModelFind.setSubject(classesDto.getSubject());
            classesRepository.save(classesModelFind);
        }

    }

    @Override
    public void addClass(ClassesDto classesDto) {
        ClassesModel classesModel =  new ClassesModel();
        classesModel.setId(classesDto.getId());
        classesModel.setSubject(classesDto.getSubject());
        classesModel.setDate(classesDto.getDate());
        classesRepository.save(classesModel);

    }


}
