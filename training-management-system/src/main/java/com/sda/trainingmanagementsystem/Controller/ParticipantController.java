package com.sda.trainingmanagementsystem.Controller;

import com.sda.trainingmanagementsystem.Dto.ClassesDto;
import com.sda.trainingmanagementsystem.Dto.CourseDto;
import com.sda.trainingmanagementsystem.Dto.ParticipantRegistrationDto;
import com.sda.trainingmanagementsystem.Service.CourseService;
import com.sda.trainingmanagementsystem.Service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class ParticipantController {

    @Autowired
    private ParticipantService participantService;

    @GetMapping("findParticipant")
    public ResponseEntity<List<ClassesDto>> getParticipants() {
        List<ParticipantRegistrationDto> participantRegistrationDtoList = participantService.getParticipants();
        return new ResponseEntity(participantRegistrationDtoList, HttpStatus.OK);
    }

    @DeleteMapping("deleteParticipant/{id}")
    public ResponseEntity deleteParticipant(@PathVariable("id") Long id) {
        String message = participantService.deleteParticipant(id);
        return new ResponseEntity(message, HttpStatus.OK);
    }

    @PostMapping("addParticipant")
    public ResponseEntity addParticipant(@RequestBody ParticipantRegistrationDto participantRegistrationDto) {
        participantService.addParticipant(participantRegistrationDto);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("getParticipant/{id}")
    public ResponseEntity<ClassesDto> findParticipantbyId(@PathVariable("id") Long id) {
        ParticipantRegistrationDto participantRegistrationDto = participantService.findParticipantbyId(id);
        return new ResponseEntity(participantRegistrationDto, HttpStatus.OK);

    }

    @PutMapping("editParticipant")
    public ResponseEntity updateClass(@RequestBody ParticipantRegistrationDto participantRegistrationDto) {
        participantService.updateParticipant(participantRegistrationDto);
        return new ResponseEntity(HttpStatus.OK);
    }
}
