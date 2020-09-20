package com.sda.trainingmanagementsystem.Repository;

import com.sda.trainingmanagementsystem.model.Teachers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TeachersRepository extends JpaRepository<Teachers,Long> {
}
