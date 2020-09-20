package com.sda.trainingmanagementsystem.Repository;

import com.sda.trainingmanagementsystem.model.ParticipantRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipantRegistrationRepository extends JpaRepository<ParticipantRegistration, Long> {
}
