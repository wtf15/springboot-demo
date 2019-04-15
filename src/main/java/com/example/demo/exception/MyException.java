package com.example.demo.exception;

/**
 * @author wtf
 * @date 2019/4/12 16:36
 * @description: 定义一个异常
 */
public class MyException extends Exception{

    public MyException(String exceptionMessage){
        super(exceptionMessage);
    }
}
