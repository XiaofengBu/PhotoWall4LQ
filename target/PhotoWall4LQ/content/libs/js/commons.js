/**
 * Created by buxiaofeng on 17/2/28.
 */
function submitData_Get(aUrl,aJson,aCallback) {
    $.ajax({
        url:aUrl,           //该路径在route中定义
        data:aJson,
        dataType:"JSON",
        async : true,
        type:"GET",                     //必须是get类型，POST类型不行
        success:function(msg){
            aCallback(msg);
        },
        error:function(msg){
            aCallback(msg);
        }
    })
}

function submitData_Post(aUrl,aJson,aCallback) {
    $.ajax({
        url:aUrl,           //该路径在route中定义
        data:aJson,
        dataType:"JSON",
        async : true,
        type:"POST",                     
        contentType :"text/plain,charset=utf-8",
        success:function(msg){
            aCallback(msg);
        },
        error:function(msg){
            aCallback(msg);
        }
    })
    
}