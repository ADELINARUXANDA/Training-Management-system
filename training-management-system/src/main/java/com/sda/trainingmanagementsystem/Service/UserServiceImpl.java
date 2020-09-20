package com.sda.trainingmanagementsystem.Service;


import com.sda.trainingmanagementsystem.Dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<UserDto> getUsers() {
        return null;
    }

    @Override
    public UserDto findUserbyId(Long id) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public void updateUser(UserDto userDto) {

    }

    @Override
    public void addUser(UserDto userDto) {

    }

    @Override
    public UserDto findUserByName(UserDto userDto) {
        return null;
    }

    @Override
    public UserDto findUserByUsername(UserDto userDto) {
        return null;
    }
}
