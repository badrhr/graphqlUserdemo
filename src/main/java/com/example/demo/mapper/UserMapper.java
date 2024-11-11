package com.example.demo.mapper;

import com.example.demo.dao.entities.User;
import com.example.demo.dto.UserDto;
import com.example.demo.dto.UserDtoInscription;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    ModelMapper mapper = new ModelMapper();


    public UserDto fromUserToUserDto(User user){
        return mapper.map(user, UserDto.class);
    }

    public User fromUserDtoToUser(UserDto userDto){
        return mapper.map(userDto, User.class);
    }

    public User fromUserDtoInscriptionToUser(UserDtoInscription userDtoInscription){
        return mapper.map(userDtoInscription, User.class);
    }
}
