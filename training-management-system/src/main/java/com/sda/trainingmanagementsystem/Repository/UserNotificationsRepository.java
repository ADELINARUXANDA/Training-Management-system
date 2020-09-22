package com.sda.trainingmanagementsystem.Repository;

import com.sda.trainingmanagementsystem.model.UserNotificationsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserNotificationsRepository extends JpaRepository<UserNotificationsModel, Long> {
}
