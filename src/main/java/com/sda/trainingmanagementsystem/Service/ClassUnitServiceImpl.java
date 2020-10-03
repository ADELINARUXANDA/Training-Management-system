package com.sda.trainingmanagementsystem.Service;

import com.sda.trainingmanagementsystem.Dto.ClassUnitDto;
import com.sda.trainingmanagementsystem.Repository.ClassUnitRepository;
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
public class ClassUnitServiceImpl implements ClassUnitService{
@Autowired
private ClassUnitRepository classUnitRepository;
@Autowired
private ClassesRepository classesRepository;
    @Override
    public List<ClassUnitModel> findClassesUnit() {
        List<ClassUnitModel> classUnitModelsList = classUnitRepository.findAll();
        List<ClassUnitModel> classUnitDtoList = new ArrayList<>();
        for(ClassUnitModel classUnitModel: classUnitModelsList){
            ClassUnitModel classUnitModels = new ClassUnitModel();
            classUnitModels.setId(classUnitModel.getId());
            classUnitModels.setName(classUnitModel.getName());
            classUnitDtoList.add(classUnitModels);
        }
        return classUnitDtoList;
    }

    @Override
    public ClassUnitDto findClassUnitById(Long id) {
        Optional<ClassUnitModel> classUnitModelOptional = classUnitRepository.findById(id);
        if (classUnitModelOptional.isPresent()){
            ClassUnitModel classUnitModelFind = classUnitModelOptional.get();
            ClassUnitDto classUnitDto = new ClassUnitDto();
            classUnitDto.setId(classUnitModelFind.getId());
            classUnitDto.setName(classUnitModelFind.getName());
            return  classUnitDto;

        }

        return null;
    }

    @Override
    public String deleteClassUnit(Long id) {
        classUnitRepository.deleteById(id);

        return null;
    }

    @Override
    public void updateClassUnit(ClassUnitDto classUnitDto) {
        Optional<ClassUnitModel> classUnitModelOptional = classUnitRepository.findById(classUnitDto.getId());
        if(classUnitModelOptional.isPresent()){
            ClassUnitModel classUnitModelFind= classUnitModelOptional.get();
            classUnitModelFind.setId(classUnitDto.getId());
            classUnitModelFind.setName(classUnitDto.getName());
            classUnitRepository.save(classUnitModelFind);
        }

    }

    @Override
    public void addClassUnit(ClassUnitDto classUnitDto) {
        ClassUnitModel classUnitModel = new ClassUnitModel();
        classUnitModel.setId(classUnitDto.getId());
        classUnitModel.setName(classUnitDto.getName());
        classUnitRepository.save(classUnitModel);

    }

    public void asociationClassAtClassUnit(Long id_ClassUnit, Long id_class){
        Optional<ClassUnitModel> classUnitModelOptional = classUnitRepository.findById(id_ClassUnit);
        if (classUnitModelOptional.isPresent()) {
            ClassUnitModel classUnitModelFind = classUnitModelOptional.get();
            Optional<ClassesModel> classesModelOptional = classesRepository.findById(id_class);
            if(classesModelOptional.isPresent()){
                ClassesModel classesModelFind = classesModelOptional.get();
                classUnitModelFind.getClassesArrayList().add(classesModelFind);
            }
            }
        }




    }
