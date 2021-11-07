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

//  @GetMapping("/intro")
//  public String intro() {
//    String output =
//      "Welcome to our Ticket Issuing System.\n" +
//        "/users - returns list of users.\n" +
//        "/users/{firstName} - returns list of users with the given firstName.\n" +
//        "/users/{firstName}/{id} - returns a specific user that matches given name and id.\n" +
//        "/user with parameters of firstName and lastName example user?firstName=(enter first name))&lastname=(enter first name))\n";
//    String html = output.replaceAll("(\n)", "<br>");
//    return html;
//  }

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
        service.changePassword(resetpw, id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id, @RequestBody String incomingAuthorization) {
        service.deleteUser(id, incomingAuthorization);
    }

}
