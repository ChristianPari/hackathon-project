package com.hackathon.responseservice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResponseNotFound extends RuntimeException {
    public ResponseNotFound() {
        super("Response Not Found");
    }

    public ResponseNotFound(String message) {
        super(message);
    }
}
