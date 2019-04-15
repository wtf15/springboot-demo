package com.example.demo.exception;

import com.example.demo.common.ResultInfo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wtf
 * @date 2019/4/12 16:46
 * @description: 全局异常处理类

 * @ControllerAdvice注解将作用在所有注解了@RequestMapping的控制器的方法上
　　@ExceptionHandler：用于全局处理控制器里的异常
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public ResultInfo<String> jsonErrorHandler(MyException e) throws Exception {
        ResultInfo<String> resultInfo = new ResultInfo<>();
        resultInfo.setErr(null,e.getMessage());
        return resultInfo;
    }
}
