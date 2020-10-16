package com.lzx.common.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;
@Data
public class R {
    //私有化不让new
    private R(){};
    @ApiModelProperty(value = "是否成功")
    private Boolean success;
    @ApiModelProperty(value = "返回码/20000成功20001失败")
    private Integer code;
    @ApiModelProperty(value = "返回消息")
    private String message;
    @ApiModelProperty(value = "返回数据")
    private Map<String, Object> data = new HashMap<String, Object>();

    /**
     * 成功返回时
     * */
    public static R OK(){
        R stipulation = new R();
        stipulation.setSuccess(true);//是否成功
        stipulation.setCode(MyCode.OK);//返回码/20000成功20001失败
        stipulation.setMessage("成功");
        return  stipulation;
    }
    /**
     * 失败时
     * */
    public static R ON(){
        R stipulation = new R();
        stipulation.setSuccess(false);//是否成功
        stipulation.setCode(MyCode.ERROR);//返回码/20000成功20001失败
        stipulation.setMessage("失败");
        return  stipulation;
    }
    //通过链式编程来设置成功 true/失败 flase
    public R success(Boolean success){
        this.setSuccess(success);
        return this;
    }
    //通过链式编程来设置code码
    public R code(Integer code){
        this.setCode(code);
        return this;
    }
    //通过链式编程来设置返回中文成功or失败
    public R message(String message){
        this.setMessage(message);
        return this;
    }

    public R data(String key, Object value){
        this.data.put(key, value);
        return this;
    }
    public R data(Map<String, Object> map){
        this.setData(map);
        return this;
    }
}
