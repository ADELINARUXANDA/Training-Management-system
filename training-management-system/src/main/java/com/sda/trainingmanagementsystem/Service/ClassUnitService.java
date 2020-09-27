package com.sda.trainingmanagementsystem.Service;

import com.sda.trainingmanagementsystem.Dto.ClassUnitDto;
import com.sda.trainingmanagementsystem.model.ClassUnitModel;

import java.util.List;

public interface ClassUnitService  {
    List<ClassUnitModel> findClassesUnit();
    ClassUnitDto findClassUnitById(Long id);
    String deleteClassUnit(Long id);
    void updateClassUnit(ClassUnitDto classUnitDto);
    void addClassUnit(ClassUnitDto classUnitDto);
}
