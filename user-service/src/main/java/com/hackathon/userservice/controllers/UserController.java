package com.hackathon.userservice.controllers;

import com.hackathon.userservice.models.Resetpw;
import com.hackathon.userservice.services.UserService;
import com.hackathon.userservice.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {



    @Autowired
    public UserService service;

    @GetMapping
    public List<User> getUsers() {
//        System.out.println(url);
        return service.getAllUsers();
    }

    @GetMapping("/{userID}")
    public User getUserByID(@PathVariable("userID") Long userID) {
        return service.getUserByID(userID);
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        return service.addUser(user);
    }

    @PutMapping("/resetpw/{id}")
    public void resetPassword(@PathVariable("id") Long id, @RequestBody Resetpw resetpw) {
        //prevpass
        //newpass
        //confirmation
        service.changePassword(resetpw, id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id, @RequestBody String incomingAuthorization) {
        service.deleteUser(id, incomingAuthorization);
    }

}
