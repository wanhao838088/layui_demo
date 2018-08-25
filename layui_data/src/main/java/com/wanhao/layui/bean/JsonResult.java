package com.wanhao.layui.bean;

/**
 * Created by LiuLiHao on 2018/8/25 22:46.
 * 描述：
 * 作者： LiuLiHao
 */
public class JsonResult {
    //layui code
    private Integer code;
    private String msg;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public JsonResult(Integer code, String msg) {

        this.code = code;
        this.msg = msg;
    }

    public JsonResult(Integer code) {
        this.code = code;
        if(code == 0)  this.msg = "success";
        if(code == 1)  this.msg = "error";
    }
}
