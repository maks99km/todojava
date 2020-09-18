package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class MainController {
    @Autowired
    private UserRepository userRepo;

    @PostMapping("/user")
    Boolean createUser(@RequestParam String name
            , @RequestParam String email){
        User user1 = new User();
        user1.setEmail(name);
        user1.setName(email);
        userRepo.save(user1);
        return true;

    }

    @GetMapping("/user")
    public @ResponseBody Iterable<User> getUser(){
        return userRepo.findAll();
    }

    @GetMapping("/u")
    public @ResponseBody
    Optional<User> getUserById(){
        return userRepo.findById(1);
    }
}
