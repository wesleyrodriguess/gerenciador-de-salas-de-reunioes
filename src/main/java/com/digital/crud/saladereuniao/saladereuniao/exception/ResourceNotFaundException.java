package com.digital.crud.saladereuniao.saladereuniao.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFaundException extends Exception {

    private static final long serialVersionUID= 1L;

    public ResourceNotFaundException(String message) {
        super(message);
    }
}
