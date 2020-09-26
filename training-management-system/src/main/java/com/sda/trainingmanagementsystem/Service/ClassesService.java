package com.sda.trainingmanagementsystem.Service;


import com.sda.trainingmanagementsystem.Dto.ParticipantRegistrationDto;
import com.sda.trainingmanagementsystem.Repository.ClassesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClassesService {

    ParticipantRegistrationDto findParticipantbyId(Long id);
    void deleteParticipant(Long id);
    void updateParticipant(ParticipantRegistrationDto participantRegistrationDto);
    void addParticipant(ParticipantRegistrationDto participantRegistrationDto);


}
