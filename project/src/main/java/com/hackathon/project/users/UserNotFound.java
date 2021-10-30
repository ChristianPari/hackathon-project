package com.hackathon.project.users;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.nio.file.attribute.UserPrincipalNotFoundException;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFound extends RuntimeException {
    public UserNotFound(String s) {
        super(s);
    }
}
