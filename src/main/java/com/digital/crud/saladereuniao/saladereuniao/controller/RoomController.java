package com.digital.crud.saladereuniao.saladereuniao.controller;


import com.digital.crud.saladereuniao.saladereuniao.exception.ErrorDetails;
import com.digital.crud.saladereuniao.saladereuniao.exception.ResouceNotFaundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class RoomController {

    @ExceptionHandler(ResouceNotFaundException.class)
    public ResponseEntity<?> resourceNotFoundException(ResouceNotFaundException ex, WebRequest request) {

        ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<?>globalExceptionHandler(Exception ex, WebRequest request) {

        ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
