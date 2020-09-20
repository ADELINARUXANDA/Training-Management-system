package com.sda.trainingmanagementsystem.Service;

import com.sda.trainingmanagementsystem.Dto.ClassesDto;
import com.sda.trainingmanagementsystem.Dto.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> getUsers();
    UserDto findUserbyId(Long id);
    void deleteUser(Long id);
    void updateUser(UserDto userDto);
    void addUser(UserDto userDto);
    UserDto findUserByName(UserDto userDto);
    UserDto findUserByUsername(UserDto userDto);
}
