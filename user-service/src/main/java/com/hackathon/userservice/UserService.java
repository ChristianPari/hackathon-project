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

    public User getUserByID(Long id) {
        return repository.getById(id);
    }

    public void deleteUser(Long id) {
        if (!repository.existsById(id))
            throw new UserNotFound();
        repository.deleteById(id);
    }

    public void changePassword(Resetpw resetpw, Long id) {
        if (!repository.getById(id).getPassword().equals(resetpw.getPreviousPassword()))
            throw new WrongPassword();
        if (!resetpw.getNewPassword().equals(resetpw.getConfirmation()))
            throw new WrongPassword("Passwords do not match");
        repository.getById(id).setPassword(resetpw.getNewPassword());
    }
}
