package com.example.food.exceptions;

public class ProductNotFoundException extends RuntimeException{

    public ProductNotFoundException(String message){
        super(message);
    }
}
