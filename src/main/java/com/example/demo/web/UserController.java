package com.example.demo.web;

import com.example.demo.dto.UserDto;
import com.example.demo.dto.UserDtoInscription;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

//getUserById(id: ID): User

    @QueryMapping
    public UserDto getUserById(@Argument Long id) {
        return userService.getUserById(id);
    }

    //addUser(userInscription: UserInscription):User
    @MutationMapping
    public UserDto addUser(@Argument UserDtoInscription userInscription){
        return userService.addUser(userInscription);
    }

}
