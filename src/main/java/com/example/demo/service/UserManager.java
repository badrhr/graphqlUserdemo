package com.example.demo.service;

import com.example.demo.dao.entities.User;
import com.example.demo.dao.repositories.UserRepository;
import com.example.demo.dto.UserDto;
import com.example.demo.dto.UserDtoInscription;
import com.example.demo.mapper.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserManager implements UserService {

    private UserRepository userRepository;

    private UserMapper mapper;

    @Override
    public UserDto getUserById(Long id) {
        return mapper.fromUserToUserDto(userRepository.findById(id).get());
    }

    @Override
    public UserDto addUser(UserDtoInscription userDtoInscription) {
        return mapper.fromUserToUserDto(userRepository.save(mapper.fromUserDtoInscriptionToUser(userDtoInscription)));
    }
}
