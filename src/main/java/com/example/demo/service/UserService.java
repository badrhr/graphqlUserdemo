package com.example.demo.service;

import com.example.demo.dao.entities.User;
import com.example.demo.dto.UserDto;
import com.example.demo.dto.UserDtoInscription;

public interface UserService {

    public UserDto getUserById(Long id);
    //...
    public UserDto addUser(UserDtoInscription userDtoInscription);
}
