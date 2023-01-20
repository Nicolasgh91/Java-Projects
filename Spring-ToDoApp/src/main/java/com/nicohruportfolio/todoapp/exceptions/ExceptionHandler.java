package com.nicohruportfolio.todoapp.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class ExceptionHandler extends ResponseEntityExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(value = {ToDoExceptions.class})
    protected ResponseEntity<Object> handleConflict(ToDoExceptions ex, WebRequest request){
        String responseBody = ex.getMessage();
        return handleExceptionInternal(ex,responseBody,
                new HttpHeaders(), ex.getHttpStatus(), request);
    }

}
