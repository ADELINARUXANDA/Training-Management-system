package com.sda.trainingmanagementsystem.Service;

import com.sda.trainingmanagementsystem.Dto.ParticipantRegistrationDto;
import com.sda.trainingmanagementsystem.Dto.UserDto;
import com.sda.trainingmanagementsystem.Repository.ParticipantRegistrationRepository;
import com.sda.trainingmanagementsystem.model.ParticipantRegistrationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ParticipantServiceImpl implements ParticipantService {
    @Autowired
    private ParticipantRegistrationRepository participantRegistrationRepository;
    @Override
    public List<ParticipantRegistrationDto> getRaprticipants() {
        List<ParticipantRegistrationDto> participantRegistrationDtoList = new ArrayList<>();
        List<ParticipantRegistrationModel> participantRegistrationModels = participantRegistrationRepository.findAll();
        for(ParticipantRegistrationModel  participantRegistrationModel : participantRegistrationModels) {
            ParticipantRegistrationDto participantRegistrationDto = new ParticipantRegistrationDto();
            participantRegistrationDto.setId(participantRegistrationModel.getId());
            participantRegistrationDto.setParticipant(participantRegistrationModel.getParticipant());
            participantRegistrationDto.setCourse(participantRegistrationModel.getCourse());
            participantRegistrationDto.setParticipant(participantRegistrationModel.getParticipant());
            participantRegistrationDto.setData(participantRegistrationDto.getData());
            participantRegistrationDtoList.add(participantRegistrationDto);

        }
        return participantRegistrationDtoList;

    }

    @Override
    public ParticipantRegistrationDto findParticipantbyId(Long id) {
        Optional<ParticipantRegistrationModel> participantRegistrationModelOptional = participantRegistrationRepository.findById(id);
        if (participantRegistrationModelOptional.isPresent()) {
            ParticipantRegistrationModel participantRegistrationModelFind = participantRegistrationModelOptional.get();
            ParticipantRegistrationDto participantRegistrationDto = new ParticipantRegistrationDto();
            participantRegistrationDto.setId(participantRegistrationModelFind.getId());
            participantRegistrationDto.setData(participantRegistrationModelFind.getData());
            participantRegistrationDto.setCourse(participantRegistrationModelFind.getCourse());
            participantRegistrationDto.setParticipant(participantRegistrationModelFind.getParticipant());
            return participantRegistrationDto;
        }
        return null;
    }

    @Override
    public void deleteParticipant(Long id) {
participantRegistrationRepository.deleteById(id);
    }

    @Override
    public void updateParticipant(ParticipantRegistrationDto participantRegistrationDto) {
Optional<ParticipantRegistrationModel> participantRegistrationModel = participantRegistrationRepository.findById(participantRegistrationDto.getId())
     if (participantRegistrationModel.isPresent()){
         ParticipantRegistrationModel participantRegistrationModelFind = participantRegistrationModel.get();
         participantRegistrationModelFind.setId(participantRegistrationDto.getId());
         participantRegistrationModelFind.setCourse(participantRegistrationDto.getCourse());
         participantRegistrationModelFind.setData(participantRegistrationDto.getData());
         participantRegistrationModelFind.setParticipant(participantRegistrationDto.getParticipant());

    }


}

    @Override
    public void addParticipant(ParticipantRegistrationDto participantRegistrationDto) {
        ParticipantRegistrationModel participantRegistrationModel = new ParticipantRegistrationModel();
        participantRegistrationModel.setId(participantRegistrationDto.getId());
        participantRegistrationModel.setCourse(participantRegistrationDto.getCourse());
        participantRegistrationModel.setData(participantRegistrationDto.getData());
        participantRegistrationModel.setParticipant(participantRegistrationDto.getParticipant());

    }

    @Override
    public ParticipantRegistrationDto findParticpantBytype(ParticipantRegistrationDto participantRegistrationDto) {
        return null;
    }

    @Override
    public ParticipantRegistrationDto findUserByName(ParticipantRegistrationDto participantRegistrationDto) {
        return null;
    }

    @Override
    public ParticipantRegistrationDto findUserByUsername(ParticipantRegistrationDto participantRegistrationDto) {
        return null;
    }
}
