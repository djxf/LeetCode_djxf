auto("fast");

var ok = "确认";
var helpbuy = "抢单"    //新版本中抢单已经不是文字
var qdId = "ia";        //抢单按钮的id
var qdId2 = "atz";
var threads = "子线程";
var main_thread = "主线程";
var refresh = "刷新订单";
var order = "确认抢单"
var todo = "成功打开蜂鸟众包平台 即将为你抢单"
var todo_exit = "检测到已退出平台 已停止抢单 抢单请重新打开"
var package_name = "me.ele.crowdsource";
var cancle = "取消";
var isOpen;             //记录打开蜂鸟是否成功

//点击抢单函数
function qdan(){
     //查找须设置超时时间否则陷入死循环 id = ia
     var bt_helpBuy = id(qdId).find(250);
     for(var i=0;i<=bt_helpBuy.length-1;i++){
         if(bt_helpBuy[i] !=null && bt_helpBuy[i].text != "待取货"){
             bt_helpBuy[i].click();
             device.vibrate(50);
             toast("已检测到抢单");
         }
     }

     var bt_qd = id(qdId2).find(250);
     for(var i=0;i<=bt_qd.length-1;i++){
        if(bt_qd[i] !=null && bt_qd[i].text != "确认送达"){
            bt_qd[i].click();
            device.vibrate(50);
            toast("已检测到抢单");
        }
     }
}

 
isOpen = app.launchPackage(package_name);
if(isOpen){
    sleep(100);
    toast(todo);
}
//主线程
while(true){
       //抢单
       qdan();
       //直接点击确定
       click(ok);
       var re_cancle = text(cancle).findOne(50);
}