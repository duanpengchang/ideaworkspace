package com.fh.utils;

public class ResponseResult{


    private Integer code;

    private String message;


    private Object data;


    private ResponseResult(Integer code,String message,Object data){
        this.code=code;
        this.message=message;
        this.data=data;
    }



    public static ResponseResult nice(Object obj){
        return new ResponseResult(200,"祝贺你",obj);
    }

    public static ResponseResult fail(String message){
        return new ResponseResult(250,"异常了",null);

    }


    public  ResponseResult(Integer code,String message){
        this.message=message;
        this.code=code;
    };
    public static ResponseResult error(Integer code, String message){
        return new ResponseResult(code,message);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
