package com.sda.trainingmanagementsystem.Repository;

import com.sda.trainingmanagementsystem.model.ClassesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassesRepository extends JpaRepository<ClassesModel, Long> {
}
