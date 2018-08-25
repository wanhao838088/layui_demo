package com.wanhao.layui.bean;

import java.util.List;

/**
 * Created by LiuLiHao on 2018/8/25 22:46.
 * 描述：
 * 作者： LiuLiHao
 */
public class JsonArrayResult<T> extends JsonResult {
    public JsonArrayResult(Integer code, List<T> data) {
        super(code);
        this.data = data;
    }

    //返回的数据条数
    private Integer count;

    public Integer getCount() {
        if(count == null || count == 0) return this.data.size();
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    //数据集合
    private List<T> data;

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
