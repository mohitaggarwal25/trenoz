package com.trenoz.rest;

public class Notification {

    private Integer id;
    private String message;

    public Notification(){}
    
    public Notification(Integer id, String message) {
        this.id = id;
        this.message = message;
    }

    public Integer getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}
