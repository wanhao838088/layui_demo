/**
 * 定义一个模块
 * Created by Administrator on 2018/8/25.
 */
layui.define(['jquery'], function(exports){
    var $ = layui.jquery;
    var obj = {
        ajax: function (url, type, dataType, data, callback) {
            $.ajax({
                url: url,
                type: type,
                dataType: dataType,
                data: data,
                success: callback
            });
        },
        msg:function () {
            alert(1);
        },
        //页脚
        footer:function (element) {
            $(element).append('<div class="layui-footer footer"><p><span>copyright @2018 驊驊龔頾</span>' +
                '<a onclick="donation()" class="layui-btn layui-btn-danger layui-btn-sm">捐赠作者</a></p></div>');
        }
    };
    //输出接口
    exports('myCommon', obj);
});
