package com.eduhub.eduhub_backend.Exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
//Template for custom exception
public class ErrorResponse {
    private LocalDateTime timestamp; //it is java class to know When error happened
    private int status; //to show the status codes
    private String message;  // student not found
    private String error;  // stores NOT_FOUND snd BAD_REQUEST
    private String path;  //students/10

//    public ErrorResponse(LocalDateTime timestamp, int status, String message, String error, String path) {
//        this.timestamp = timestamp;
//        this.status = status;
//        this.message = message;
//        this.error = error;
//        this.path = path;
//
//    }
//    public LocalDateTime getTimestamp() {
//
//        return timestamp;
//    }
//    public int getStatus() {
//
//        return status;
//    }
//    public String getMessage() {
//
//        return message;
//    }
//    public String getError() {
//
//        return error;
//    }
//    public String getPath() {
//
//        return path;
//    }

}