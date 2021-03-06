package com.sda.trainingmanagementsystem.Repository;

import com.sda.trainingmanagementsystem.model.NotificationModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NotificationRepository extends JpaRepository<NotificationModel, Long> {
}
