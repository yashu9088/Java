package org.geeksforgeeks.spring_workshop.controller;

import org.geeksforgeeks.spring_workshop.entity.User;
import org.geeksforgeeks.spring_workshop.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/test-db")
    public String testDb() {
        userRepository.save(new User(1, "Yash"));
        return "DB Connected! User saved.";
    }
}



























//package org.geeksforgeeks.spring_workshop.controller;
//
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class UserController {
//
//    @GetMapping("/hello_world")
//    public double helloWorld() {
//        return 1+2;
//    }
//}
