package 创建对象的方式;

import java.io.Serializable;

public class Hello implements Cloneable,Serializable{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    public void sayHello(){
        System.out.println("Hello World!");
    }
}