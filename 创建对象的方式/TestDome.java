package 创建对象的方式;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class TestDome {
    public static void main(String[] args) {
        // 1 使用new关键字,会增加耦合度
        Hello hello1 = new Hello();

        // 2 使用反射机制
        try {
             Class helloClass = Class.forName("Hello.java");
             Hello hello2 = (Hello) helloClass.newInstance();
        } catch (  Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

       
        try {
            // 3 使用Constuctor类的newInstance方法
            // 1 获取类对象
            Class helloClass = Class.forName("Hello.java");

            // 2 获取构造器

            Constructor constructor = helloClass.getConstructor();
            Hello hello3 = (Hello)constructor.newInstance();
        } catch (  NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (  Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // 4 克隆 必须实现Cloneable接口
        try {
            Hello hello4 = (Hello)hello1.clone();
        } catch (Exception e) {
            //TODO: handle exception
        }
       


        try {
            // 5 反序列化机制 需要实现Serializable接口
            //1 用于存储对象的文件
            Hello hello5 = new Hello();
            File f = new File("Hello.obj");
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            //序列化对象，写入到磁盘中
            oos.writeObject(hello5);
            //反序列化对象
            Hello hello6 = (Hello)ois.readObject();
            hello6.sayHello();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}