package com.example.superhero.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT, reason = "Conflict")
public class CustomException extends Exception {

    private static final String DESCRIPTION = "CustomException";

    public CustomException(String detail) {
        super(DESCRIPTION + ". " + detail);
    }
}
