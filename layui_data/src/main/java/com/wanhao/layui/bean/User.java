package com.wanhao.layui.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * Created by LiuLiHao on 2018/8/25 21:37.
 * 描述： 普通对象
 * 作者： LiuLiHao
 */
@Setter
@Getter
@ToString
public class User implements Serializable{

    private Integer id;
    private String username;
    private String sign;
    private String email;
    private String sex;
    private String city;
    private String experience;

    public User() {
    }

    public User(Integer id, String username, String sign, String email, String sex,
                String city, String experience) {
        this.id = id;
        this.username = username;
        this.sign = sign;
        this.email = email;
        this.sex = sex;
        this.city = city;
        this.experience = experience;
    }
}
