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

    public UserService(){}

    public List<User> getUsers() {
        users.add(new User("Example", "Name"));
        return users;
        /*
        if(users.size()>0){
        return users;
        }
        return null;
         */
    }
}
