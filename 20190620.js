//auto.js 脚本

id1 = "tv_item_sayauthor";

var btn = id(id1).find();
// log(btn.text())
// log(btn.text() != "1*******144");
for(var i=0;i <= btn.length -1;i++){
    if(btn[i].text() == "7"){
        log(btn[i].text());
        log("唯独我不等于7");
    }
}
