package org.swami.exception;

import org.springframework.http.HttpStatus;

public class CustomErrorResponse {
    private HttpStatus status;
    private String errorMessage;
    private String errorCode;

    public CustomErrorResponse() {
    }

    public CustomErrorResponse(HttpStatus status, String errorMessage, String errorCode) {
        this.status = status;
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String toString() {
        return "CustomErrorResponse{" +
                "status=" + status +
                ", errorMessage='" + errorMessage + '\'' +
                ", errorCode='" + errorCode + '\'' +
                '}';
    }
}
