auto("fast");

var ok = "确认";
var helpbuy = "抢单"    //新版本中抢单已经不是文字
var qdId = "i6";        //抢单id 修改即在这里配置修改即可
var qdId2 = "i6";       //抢单id
var threads = "子线程";
var main_thread = "主线程";
var refresh = "刷新订单";
var order = "确认抢单"
var todo = "成功打开蜂鸟众包平台 即将为你抢单"
var todo_exit = "检测到已退出平台 已停止抢单 抢单请重新打开"    //提示语
var package_name = "me.ele.crowdsource";    //应用包名
var cancle = "取消";        //取消文字
var qrqh = "确认取货";      //确认取货文字
var sbdd = "上报到店";    //上报到店文字
var qrsd = "确认送达";         //待送达文字
var isOpen;             //记录打开蜂鸟是否成功
 

function qdan(){
     //查找须设置超时时间否则陷入死循环 id = ia  在查找全部控件时没有参数
     var bt_helpBuy = id(qdId).find();
     for(var i=0;i<=bt_helpBuy.length-1;i++){
         if(bt_helpBuy[i] !=null && bt_helpBuy[i].text() === ""){
            //查找文字 找到文字直接return 
            var textK = text(sbdd).findOne(125);
            var textK2 = text(qrqh).findOne(125);
            var textK3 = text(qrsd).findOne(125);
            if(textK != null || textK2 != null || textK3 != null){
                return;
            }
             bt_helpBuy[i].click();
             sleep(100);
             click(ok);
             device.vibrate(50);
             toast("已检测到抢单");
             log(bt_helpBuy[i].text())  //打印点击控件的文字确认bug所在
         }
     }

     var bt_qd = id(qdId2).find();
     for(var i=0;i<=bt_qd.length-1;i++){
        if(bt_qd[i] !=null && bt_qd[i].text() === ""){
              //查找文字 找到文字直接return 
              var textK = text(sbdd).findOne(150);
              if(textK != null){
                  return;
              }
            bt_qd[i].click();
            sleep(100);
            click(ok);
            device.vibrate(50);
            toast("已检测到抢单");
            log(bt_helpBuy[i].text())  //打印点击控件的文字确认bug所在
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
}