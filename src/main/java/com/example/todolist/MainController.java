package com.example.todolist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {
    @Autowired
    private UserRepository userRepo;

    @GetMapping("/")
    String index(){
        return "hello world!";
    }

    @GetMapping("/book")
    Book book(){
        Book book = new Book();
        book.setId(1);
        book.setAutor("autor");
        book.setName("James Bond");
        return book;
    }

    @PostMapping("/user")
    Boolean createUser(@RequestParam String name
            , @RequestParam String email){
        User user1 = new User();
        user1.setEmail(email);
        user1.setName(name);
        userRepo.save(user1);
        return true;
    }

    @GetMapping("/user")
    public @ResponseBody Iterable<User> getUser() { return userRepo.findAll();}
}
