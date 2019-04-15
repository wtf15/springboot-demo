package com.example.demo.common;

import java.io.Serializable;

/**
 * @author wtf
 * @date 2019/4/12 16:43
 * @description: 返回信息
 */
public class ResultInfo<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private boolean success;

    private String errCode;

    private String errDesc;

    private T module;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrDesc() {
        return errDesc;
    }

    public void setErrDesc(String errDesc) {
        this.errDesc = errDesc;
    }

    public T getModule() {
        return module;
    }

    public void setModule(T module) {
        this.module = module;
    }

    public void setModuleWithSuccess(T module) {
        this.module = module;
        setSuccess(true);

    }

    public void setErr(String errCode, String errDesc) {
        setErrCode(errCode);
        setErrDesc(errDesc);
        setSuccess(false);
    }

    public String toErrorString() {
        if (errCode == null && errDesc == null) {
            return "no  error info";
        } else {
            return "errCode:" + errDesc + ", errDesc:" + errDesc;
        }
    }
}
