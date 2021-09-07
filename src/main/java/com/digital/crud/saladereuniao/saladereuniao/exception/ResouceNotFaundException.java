package com.digital.crud.saladereuniao.saladereuniao.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResouceNotFaundException extends Exception {

    private static final long serialVersionUID= 1L;

    public ResouceNotFaundException(String message) {
        super(message);
    }
}
