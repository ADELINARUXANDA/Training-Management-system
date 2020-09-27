package com.sda.trainingmanagementsystem.Service;

import com.sda.trainingmanagementsystem.Dto.ParticipantRegistrationDto;

import java.util.List;

public interface ParticipantService {
    List<ParticipantRegistrationDto> getParticipants();
    ParticipantRegistrationDto findParticipantbyId(Long id);
    String deleteParticipant(Long id);
    void updateParticipant(ParticipantRegistrationDto participantRegistrationDto);
    void addParticipant(ParticipantRegistrationDto participantRegistrationDto);
    ParticipantRegistrationDto findParticpantBytype(ParticipantRegistrationDto participantRegistrationDto);
    ParticipantRegistrationDto findUserByName(ParticipantRegistrationDto participantRegistrationDto);
    ParticipantRegistrationDto findUserByUsername(ParticipantRegistrationDto participantRegistrationDto);
}
