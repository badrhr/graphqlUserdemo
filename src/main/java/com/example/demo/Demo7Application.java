package com.example.demo;

import com.example.demo.dao.entities.User;
import com.example.demo.dao.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Demo7Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo7Application.class, args);
    }

    @Bean
    CommandLineRunner start(UserRepository userRepository){
        return args -> {

            List<User> users = List.of(
                    User.builder().name("x").email("x@email.com").password("354658f4ew684f6").build(),
                    User.builder().name("e").email("e@email.com").password("sdc5468sdf4as").build(),
                    User.builder().name("r").email("r@email.com").password("asf654a8s9f4").build(),
                    User.builder().name("d").email("d@email.com").password("a5FS4AS86").build()

            );
            userRepository.saveAll(users);
        };
    }

}
