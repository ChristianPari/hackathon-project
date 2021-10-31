package com.hackathon.project.users;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<User> users = new ArrayList<>();

    {
        users.add(new User("Freddy", "Canido"));
        users.add(new User("Example", "Name"));
        users.add(new User("Example", "Name"));
    }

    public UserService() {
    }

    public List<User> getUsers() {
        return users;
        /*
        if(users.size()>0){
        return users;
        }
        return null;
         */
    }

    public List<User> getNamedUsers(String firstName) {
        List<User> output = new ArrayList<>();
        for (User user : users) {
            if (user.getFirstName().equals(firstName)) {
                output.add(user);
            }
        }
        return output;
    }

    public User getUser(String firstName, Long id) {
        for (User user : users) {
            if (user.getFirstName().equals(firstName) && user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    public User addUser(String firstName, String lastName) {
        User user = new User(firstName, lastName);
        users.add(user);
        return user;
    }
}
