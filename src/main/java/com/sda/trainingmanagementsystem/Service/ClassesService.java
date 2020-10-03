package com.sda.trainingmanagementsystem.Service;


import com.sda.trainingmanagementsystem.Dto.ClassesDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClassesService {
    List<ClassesDto> findClasses();
    ClassesDto findClassesById(Long id);
    String deleteClass(Long id);
    void updateClass(ClassesDto classesDto);
    void addClass(ClassesDto classesDto);


}
