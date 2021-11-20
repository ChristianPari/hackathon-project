package com.hackathon.userservice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class WrongPassword extends RuntimeException{
    public WrongPassword() {
        super("Wrong Password");
    }

    public WrongPassword(String message) {
        super(message);
    }
}
