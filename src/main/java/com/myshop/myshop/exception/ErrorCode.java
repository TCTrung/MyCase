package com.myshop.myshop.exception;

public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999,"Uncategorized error"),
    INVALID_KEY(1001,"Uncategorized error"),
    USER_EXISTED(1002,"User already existed"),
    USERNAME_INVALID(1003,"Username must be at least 3 characters"),
    INVALID_PASSWORD(1004,"Password must be at least 8 characters"),
    USER_NOT_EXISTED(1005,"Username not existed")
    ;


    private int code;
    private String message;

     ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
