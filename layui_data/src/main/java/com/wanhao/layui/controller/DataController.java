package com.wanhao.layui.controller;

import com.wanhao.layui.bean.JsonArrayResult;
import com.wanhao.layui.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

/**
 * Created by LiuLiHao on 2018/8/25 21:09.
 * 描述： layui的table数据返回
 * 作者： LiuLiHao
 */
@Controller
public class DataController {

    /**
     * 查询
     */
    @ResponseBody
    @RequestMapping(value = "data")
    public JsonArrayResult<User> getTableData(Integer page, Integer pageSize, String cond){
        //有分页
        ArrayList<User> users = new ArrayList<>();

        if (page!=null && page>0 && pageSize!=null && pageSize>0){
            for(int i=0;i<pageSize;i++){
                User user = new User(i + (pageSize * (page-1)), "杨铭宇" + i, "黄焖鸡",
                        "yangmingyu@qq.com", "男", "浙江", "10" + i);
                users.add(user);
            }
        }else {
            for(int i=0;i<10;i++){
                User user = new User(i, "杨铭宇" + i, "黄焖鸡",
                        "yangmingyu@qq.com", "男", "浙江", "10" + i);
                users.add(user);
            }
        }

        return new JsonArrayResult(0, users);
    }
}
