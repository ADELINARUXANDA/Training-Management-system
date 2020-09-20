package com.sda.trainingmanagementsystem.Service;

import com.sda.trainingmanagementsystem.Dto.ParticipantRegistrationDto;
import com.sda.trainingmanagementsystem.Dto.UserDto;

import java.util.List;

public interface ParticipantService {
    List<ParticipantRegistrationDto> getRaprticipants();
    UserDto findParticipantbyId(Long id);
    void deleteParticipant(Long id);
    void updateParticipant(ParticipantRegistrationDto participantRegistrationDto);
    void addParticipant(ParticipantRegistrationDto participantRegistrationDto);
    ParticipantRegistrationDto findParticpantBytupe(ParticipantRegistrationDto participantRegistrationDto);
    ParticipantRegistrationDto findUserByName(ParticipantRegistrationDto participantRegistrationDto);
    ParticipantRegistrationDto findUserByUsername(ParticipantRegistrationDto participantRegistrationDto);
}
