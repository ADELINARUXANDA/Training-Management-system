package com.sda.trainingmanagementsystem.Repository;

import com.sda.trainingmanagementsystem.model.TeachersModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TeachersRepository extends JpaRepository<TeachersModel,Long> {
}
