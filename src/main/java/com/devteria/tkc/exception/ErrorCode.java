package com.devteria.tkc.exception;

public enum ErrorCode {
    User_Existed (1001,"tai khoan da ton tai"),

    ;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
