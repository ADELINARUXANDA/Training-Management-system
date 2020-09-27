package com.sda.trainingmanagementsystem.Controller;


import com.sda.trainingmanagementsystem.Dto.ClassesDto;
import com.sda.trainingmanagementsystem.Dto.CourseDto;
import com.sda.trainingmanagementsystem.Dto.UserDto;
import com.sda.trainingmanagementsystem.Service.ClassesService;
import com.sda.trainingmanagementsystem.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("findUsers")
    public ResponseEntity<List<ClassesDto>> getUsers() {
        List<UserDto> userDtoList = userService.getUsers();
        return new ResponseEntity(userDtoList, HttpStatus.OK);
    }

    @DeleteMapping("deleteUser/{id}")
    public ResponseEntity deleteUser(@PathVariable("id") Long id) {
        String message = userService.deleteUser(id);
        return new ResponseEntity(message, HttpStatus.OK);
    }

    @PostMapping("addUser")
    public ResponseEntity addUser(@RequestBody UserDto userDto) {
        userService.addUser(userDto);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("findClassesById/{id}")
    public ResponseEntity<ClassesDto> findUserbyId(@PathVariable("id") Long id) {
        UserDto userDto = userService.findUserbyId(id);
        return new ResponseEntity(userDto, HttpStatus.OK);

    }

    @PutMapping("editUser")
    public ResponseEntity updateUser(@RequestBody UserDto userDto) {
        userService.updateUser(userDto);
        return new ResponseEntity(HttpStatus.OK);
    }

}
