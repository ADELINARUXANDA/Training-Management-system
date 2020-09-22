package com.sda.trainingmanagementsystem.Repository;

import com.sda.trainingmanagementsystem.model.ClassUnitModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassUnitRepository extends JpaRepository<ClassUnitModel,Long> {
}
