package com.sda.trainingmanagementsystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassUnitRepository extends JpaRepository<ClassUnitRepository,Long> {
}
