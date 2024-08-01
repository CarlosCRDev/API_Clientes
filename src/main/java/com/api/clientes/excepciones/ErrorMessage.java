package com.api.clientes.excepciones;

import java.util.Date;

public class ErrorMessage {
    private Date timetamp;
    private String message;

    public ErrorMessage() {
    }

    public ErrorMessage(Date timetamp, String message) {
        this.timetamp = timetamp;
        this.message = message;
    }

    public Date getTimetamp() {
        return timetamp;
    }

    public void setTimetamp(Date timetamp) {
        this.timetamp = timetamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
