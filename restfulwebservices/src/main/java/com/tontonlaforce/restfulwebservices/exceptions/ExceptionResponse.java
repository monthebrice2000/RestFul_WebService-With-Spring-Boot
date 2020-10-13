package com.tontonlaforce.restfulwebservices.exceptions;

import java.util.Date;

public class ExceptionResponse {

    private  String message;
    private Date date;
    private String desciption;

    public ExceptionResponse(String message, Date date, String desciption) {
        this.message = message;
        this.date = date;
        this.desciption = desciption;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }
}
