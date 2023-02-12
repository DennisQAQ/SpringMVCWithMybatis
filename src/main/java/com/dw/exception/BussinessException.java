package com.dw.exception;

public class BussinessException extends RuntimeException{
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public BussinessException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public BussinessException(String message, Throwable cause, Integer code) {
        super(message, cause);
        this.code = code;
    }

}
