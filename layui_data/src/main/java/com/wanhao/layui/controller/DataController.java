package com.wanhao.layui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by LiuLiHao on 2018/8/25 21:09.
 * 描述：
 * 作者： LiuLiHao
 */
@Controller
public class DataController {

    /**
     * 查询
     */
    @ResponseBody
    @RequestMapping(value = "data")
    public List getTableData(Integer page,Integer pageSize,String cond){
        ArrayList<HashMap<String,String>> list = new ArrayList<>();
        //有分页
        if (page!=null && page>0 && pageSize!=null && pageSize>0){
            for(int i=0;i<pageSize;i++){
                HashMap<String, String> map = new HashMap<>();
                map.put("第"+(i+(pageSize*page))+"条数据","data");
                list.add(map);
            }
        }else {
            for(int i=0;i<10;i++){
                HashMap<String, String> map = new HashMap<>();
                map.put("第"+i+"条数据","data");
                list.add(map);
            }
        }

        return list;
    }
}
