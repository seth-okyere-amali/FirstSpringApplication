package org.amalitechtraining.first_spring_application.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;


@RestControllerAdvice
public class SimpleExceptionHandling {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ExceptionResponse> handleException(UserNotFoundException e) {
        var error = new  ExceptionResponse(
                HttpStatus.NOT_FOUND.toString(),
                LocalDateTime.now(),
                e.getMessage()
        );
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
}
