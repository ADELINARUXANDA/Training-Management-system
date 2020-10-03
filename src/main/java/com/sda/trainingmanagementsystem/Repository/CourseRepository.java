package com.sda.trainingmanagementsystem.Repository;

import com.sda.trainingmanagementsystem.model.CourseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<CourseModel,Long> {



}
