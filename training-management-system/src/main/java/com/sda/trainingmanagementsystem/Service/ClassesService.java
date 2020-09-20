package com.sda.trainingmanagementsystem.Service;

import com.sda.trainingmanagementsystem.Dto.ClassesDto;

import java.util.List;

public interface ClassesService {
    List<ClassesDto> GetClasses();
    ClassesDto GetClass(Long id);
    void AddClass();
    void UpdateClass();
    void DeleteClass(Long id);

}
