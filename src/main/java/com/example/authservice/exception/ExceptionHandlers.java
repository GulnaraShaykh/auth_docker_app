package com.example.authservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandlers {

    @ExceptionHandler(InvalidCredentials.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public String handleInvalidCredentials(InvalidCredentials e) {
        return e.getMessage();
    }

    @ExceptionHandler(UnauthorizedUser.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ResponseBody
    public String handleUnauthorizedUser(UnauthorizedUser e) {
        System.out.println(e.getMessage());
        return e.getMessage();
    }

}
