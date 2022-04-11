package com.ycshang.boot.exception.handler;

import com.ycshang.boot.exception.enums.ExceptionTypeEnum;
import com.ycshang.boot.exception.exception.CustomException;
import com.ycshang.boot.exception.utils.AjaxResponse;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: spring-boot-learning
 * @description:
 * @author: ycshang
 * @create: 2022-04-11 11:30
 **/

@ControllerAdvice
public class WebExceptionHandler {

    @ExceptionHandler(CustomException.class)
    @ResponseBody
    public AjaxResponse customException(CustomException e) {
        if (e.getCode() == ExceptionTypeEnum.SYSTEM_ERROR.getCode()) {
            //    400异常不需要持久化,将异常信息以有好的方式告知用户即可
            //    将500异常信息持久化处理,方便运维人员处理
        }
        return AjaxResponse.error(e);
    }


    @ExceptionHandler(Exception.class)
    @ResponseBody
    public AjaxResponse exception(Exception e) {
        //    TODO 将异常信息持久化，方便运维人员处理
        return AjaxResponse.error(new CustomException(ExceptionTypeEnum.OTHER_ERROR));
    }


    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public AjaxResponse handleBindException(MethodArgumentNotValidException ex) {
        FieldError fieldError = ex.getBindingResult().getFieldError();
        assert fieldError != null;
        return AjaxResponse.error(new CustomException(ExceptionTypeEnum.USER_INPUT_REEOE, fieldError.getDefaultMessage()));
    }


    @ExceptionHandler(BindException.class)
    @ResponseBody
    public AjaxResponse handleBindException(BindException ex) {
        FieldError fieldError = ex.getBindingResult().getFieldError();
        assert fieldError != null;
        return AjaxResponse.error(new CustomException(ExceptionTypeEnum.USER_INPUT_REEOE, fieldError.getDefaultMessage()));
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseBody
    public AjaxResponse handleIllArgumentException(IllegalArgumentException e) {
        return AjaxResponse.error(new CustomException(ExceptionTypeEnum.USER_INPUT_REEOE, e.getMessage()));
    }


}