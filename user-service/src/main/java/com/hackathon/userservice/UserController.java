package com.hackathon.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    public UserService service;

    @GetMapping
    public List<User> getUsers() {
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
