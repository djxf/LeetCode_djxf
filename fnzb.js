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

//生成从minNum ~ maxNum的随机数
function getrandomNum(minNum,maxNum){   
    switch(arguments.length){ 
        case 1: 
            return parseInt(Math.random()*minNum+1,10); 
        break; 
        case 2: 
            return parseInt(Math.random()*(maxNum-minNum+1)+minNum,10); 
        break; 
            default: 
                return 0; 
            break; 
    } 
}

//点击抢单函数
function qdan(){
     //查找须设置超时时间否则陷入死循环 id = ia
     var bt_helpBuy = id(qdId).findOne(100);
     if(bt_helpBuy != null){
        bt_helpBuy.click();
        device.vibrate(50);
        toast("已检测到抢单");
    }
     var bt_qd = id(qdId2).findOne(100);
     if(bt_qd !=null){
         bt_qd.click();
         device.vibrate(50);
         toast("已检测到抢单");
     }
    
}

    //子线程点击确定 同时查找单子
    threads.start(function(){
        while(true){
            //抢单
            qdan();
            //不进行判断直接点击确定
            click(ok);
            var re_cancle = text(cancle).findOne(50);//查找须设置超时时间否则陷入死循环
            if(re_cancle.text()=="取消"){
                click(ok);
            }else{
                log("未找到控件 但执行函数成功");
            }
        }
    });


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
            if(re_cancle!=null){
                    click(ok);
            }else{
                    log("未找到控件 但执行函数成功");
            }
            //线程睡眠 延迟点击速度 防止被屏蔽
            var randomtime = getrandomNum(5,20);
            toast("本次暂停的随机时间："+ randomtime);
            sleep(randomtime*1000);
            click(refresh);
            //抢单
            qdan();
    }