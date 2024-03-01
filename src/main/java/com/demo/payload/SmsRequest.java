package com.demo.payload;
public class SmsRequest {

    private String to;
    private String message;

    public String getTo() {
        return to;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTo(String to) {
        this.to = to;
    }
}

