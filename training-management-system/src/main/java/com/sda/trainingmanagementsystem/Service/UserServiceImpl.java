package com.sda.trainingmanagementsystem.Service;


import com.sda.trainingmanagementsystem.Dto.UserDto;
import com.sda.trainingmanagementsystem.Repository.UserRepository;
import com.sda.trainingmanagementsystem.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDto> getUsers() {
        List<UserDto> userDtoList = new ArrayList<>();
        List<UserModel> userModelList = userRepository.findAll();
        for(UserModel userModel:userModelList){
            UserDto userDto = new UserDto();
            userDto.setId(userModel.getId());
            userDto.setFirst_name(userModel.getFirst_name());
            userDto.setLast_name(userModel.getLast_name());
            userDto.setActive_status(userModel.getActive_status());
            userDto.setType(userModel.getType());
            userDto.setLogin(userModel.getLogin());
            userDto.setPassword(userModel.getPassword());

            userDtoList.add(userDto);
        }

        return userDtoList;
    }

    @Override
    public UserDto findUserbyId(Long id) {
        Optional<UserModel> userModelOptional = userRepository.findById(id);
        if (userModelOptional.isPresent()){
            UserModel userModelfind = userModelOptional.get();
            UserDto userDto = new UserDto();
            userDto.setId(userModelfind.getId());
            userDto.setFirst_name(userModelfind.getFirst_name());
            userDto.setLast_name(userModelfind.getLast_name());
            userDto.setLogin(userModelfind.getLogin());
            userDto.setType(userModelfind.getType());
            userDto.setPassword(userModelfind.getPassword());
            userDto.setActive_status(userModelfind.getActive_status());
            return userDto;
        }

        return null;
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);

    }

    @Override
    public void updateUser(UserDto userDto) {
        Optional<UserModel> userModelOptional = userRepository.findById(userDto.getId());
        if (userModelOptional.isPresent()){
            UserModel userModelFind = userModelOptional.get();
            userModelFind.setId(userDto.getId());
            userModelFind.setFirst_name(userDto.getFirst_name());
            userModelFind.setLast_name(userDto.getLast_name());
            userModelFind.setActive_status(userDto.getActive_status());
            userModelFind.setLogin(userDto.getLogin());
            userModelFind.setPassword(userDto.getPassword());
            userModelFind.setType(userDto.getType());
            userRepository.save(userModelFind);

        }

    }

    @Override
    public void addUser(UserDto userDto) {
     UserModel userModel = new UserModel();
     userModel.setId(userDto.getId());
     userModel.setFirst_name(userDto.getFirst_name());
     userModel.setLast_name(userDto.getLast_name());
     userModel.setLogin(userDto.getLogin());
     userModel.setType(userDto.getType());
     userModel.setPassword(userDto.getPassword());
     userModel.setActive_status(userDto.getActive_status());
     userRepository.save(userModel);
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
