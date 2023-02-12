package com.dw.exception;

import com.dw.config.Code;
import com.dw.config.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException Exception) {
        //1.记录日志
        //2.通知运维
        //3.发送邮件给开发人员

        return new Result(Exception.getCode(),null,Exception.getMessage());
    }



    @ExceptionHandler(BussinessException.class)
    public Result doBussinessException(BussinessException Exception) {

        return new Result(Exception.getCode(),null,Exception.getMessage());
    }


    @ExceptionHandler(Exception.class)
    public Result doException(Exception Exception){

        return new Result(Code.SYSTEM_TIMEOUT_ERR,null,"系统繁忙请稍后重试！");
        }
}
