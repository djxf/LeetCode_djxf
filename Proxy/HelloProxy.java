package Proxy;
/**
 * 
 * 代理模式：
 *          为其他对象提供一个代理以控制对某个对象的访问。
 *          代理类为被代理类预处理消息，过滤消息，并在此之后转发消息给被代理类。
 * 
 * 静态代理
 * 代理类持有被代理类的引用
 * 静态代理的缺点：由于代理类只能为一个类服务，如果需要代理的类很多，那么就需要编写大量的代理类
 * 比较繁琐。
 * 
 * 
 * 动态代理：
 *        利用反射机制在运行时创建代理类
 *        
 */
public class HelloProxy implements HelloInterface{

    //
    private HelloInterface helloInterface = new Hello();
    @Override
    public void sayHello() {
        System.out.println("Before invoke sayHello()");
        //代理类在执行具体方法时通过所持有的被代理类完成调用
        helloInterface.sayHello();
        System.out.println("after invoke sayHello()");
    }

}