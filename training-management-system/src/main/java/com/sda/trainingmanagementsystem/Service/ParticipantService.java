package com.sda.trainingmanagementsystem.Service;

import com.sda.trainingmanagementsystem.Dto.ParticipantRegistrationDto;
import com.sda.trainingmanagementsystem.Dto.UserDto;

import java.util.List;

public interface ParticipantService {
    List<ParticipantRegistrationDto> getRaprticipants();
    ParticipantRegistrationDto findParticipantbyId(Long id);
    void deleteParticipant(Long id);
    void updateParticipant(ParticipantRegistrationDto participantRegistrationDto);
    void addParticipant(ParticipantRegistrationDto participantRegistrationDto);
    ParticipantRegistrationDto findParticpantBytype(ParticipantRegistrationDto participantRegistrationDto);
    ParticipantRegistrationDto findUserByName(ParticipantRegistrationDto participantRegistrationDto);
    ParticipantRegistrationDto findUserByUsername(ParticipantRegistrationDto participantRegistrationDto);
}
