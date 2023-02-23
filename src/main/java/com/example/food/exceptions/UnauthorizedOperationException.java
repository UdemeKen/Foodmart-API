package com.example.food.exceptions;

import org.springframework.web.client.HttpClientErrorException;

public class UnauthorizedOperationException extends RuntimeException{

    public UnauthorizedOperationException(String message){
        super(message);
    }
}
