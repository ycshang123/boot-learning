package com.ycshang.boot.exception.exception;

import com.ycshang.boot.exception.enums.ExceptionTypeEnum;

/**
 * @program: spring-boot-learning
 * @description:
 * @author: ycshang
 * @create: 2022-04-11 10:43
 **/
public class CustomException  extends RuntimeException{

    private int code;
    private String message;

    private CustomException() {
    }

public CustomException(ExceptionTypeEnum exceptionTypeEnum){
        this.code = exceptionTypeEnum.getCode();
        this.message = exceptionTypeEnum.getDesc();
}


    public CustomException(ExceptionTypeEnum exceptionTypeEnum,String message){
        this.code = exceptionTypeEnum.getCode();
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}