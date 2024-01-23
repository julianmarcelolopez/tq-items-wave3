package com.example.superhero.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Internal Server Error")
public class InternalServerErrorCustomException extends Exception {

    private static final long serialVersionUID = 1L;

    private static final String DESCRIPTION = "Internal Server Error";

    public InternalServerErrorCustomException(String detail) {
        super(DESCRIPTION + ". " + detail);
    }

}