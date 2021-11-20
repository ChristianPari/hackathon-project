package com.hackathon.userservice.services;

import com.hackathon.userservice.models.Resetpw;
import com.hackathon.userservice.exceptions.WrongPassword;
import com.hackathon.userservice.exceptions.UserNotFound;
import com.hackathon.userservice.models.User;
import com.hackathon.userservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    private String authorization = "admin";

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public User addUser(User user) {
        return repository.save(user);
    }

    public User getUserByID(Long id) {
        return repository.getById(id);
    }

    public void deleteUser(Long id, String incomingAuthorization) {
        //TODO a better way to have authoriation for actions
        //temporarily local variable later possibly as a field
        if (!repository.existsById(id))
            throw new UserNotFound();
        if (!incomingAuthorization.equals(authorization))
            throw new WrongPassword();
        repository.deleteById(id);
    }

    public void changePassword(Resetpw resetpw, Long id) {
        if (!repository.getById(id).getPassword().equals(resetpw.getPreviousPassword()))
            throw new WrongPassword();
        if (!resetpw.getNewPassword().equals(resetpw.getConfirmation()))
            throw new WrongPassword("Passwords do not match");
        User user = repository.getById(id);
        user.setPassword(resetpw.getNewPassword());
        repository.save(user);
    }
}
