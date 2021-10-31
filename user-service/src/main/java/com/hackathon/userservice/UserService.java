package com.hackathon.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
  @Autowired
  private UserRepository repository;

  public List<User> getAllUsers() {
    return repository.findAll();
  }

  public User addUser(User user) {
    return repository.save(user);
  }

//  public List<User> getNamedUsers(String firstName) {
//    List<User> output = new ArrayList<>();
//    for (User user : users) {
//      if (user.getFirstName().equals(firstName)) {
//        output.add(user);
//      }
//    }
//    return output;
//  }
//
//  public User getUser(String firstName, Long id) {
//    for (User user : users) {
//      if (user.getFirstName().equals(firstName) && user.getId().equals(id)) {
//        return user;
//      }
//    }
//    return null;
//  }
}
