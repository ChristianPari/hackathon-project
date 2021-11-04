package com.hackathon.project.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
public class UserController {

    public UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String intro() {
        String output =
                "Welcome to our Ticket Issuing System.\n" +
                        "/users - returns list of users.\n" +
                        "/users/{firstName} - returns list of users with the given firstName.\n" +
                        "/users/{firstName}/{id} - returns a specific user that matches given name and id.\n" +
                        "/user with parameters of firstName and lastName example user?firstName=(enter first name))&lastname=(enter first name))\n";
        String html = output.replaceAll("(\n)", "<br>");
        return html;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/users/{firstName}")
    public List<User> getNamedUsers(@PathVariable(name = "firstName") String firstName) {
        return userService.getNamedUsers(firstName);
    }

    @GetMapping("/users/{firstName}/{id}")
    public User getUser(@PathVariable(name = "firstName") String firstName, @PathVariable(name = "id") Long id) {
        User user = userService.getUser(firstName, id);
        if (Objects.isNull(user)) {
            throw new UserNotFound(String.format("User with name %s and id %s was not found", firstName, id));
        }
        return userService.getUser(firstName, id);
    }

    @PostMapping("/user")
    public User addUser(@RequestParam(value = "firstName", defaultValue = "firstName") String firstName,
                        @RequestParam(value = "lastName", defaultValue = "lastName") String lastName) {
        return userService.addUser(firstName, lastName);
    }


}
