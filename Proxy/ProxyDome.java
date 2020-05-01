package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理dome
 * 动态代理底层实现：
 * 1 通过实现Invocation实现自己的调用处理器
 * 2 通过Proxy类指定ClassLoader对象和一组interface来创建动态代理类
 * 3 通过反射机制获得动态代理类的构造函数。其唯一参数类型是调用处理器接口类型。
 * 4 通过构造函数创建动态代理类实例，构造时调用处理器对象作为参数传入。
 */
public class ProxyDome {
    public static void main(String[] args) {
        // HelloProxy helloProxy = new HelloProxy();
        // helloProxy.sayHello();
        
        HelloInterface helloInterface = new Hello();
        InvocationHandler invocationHandler = new ProxyHandler(helloInterface);
        HelloInterface proxyHello = (HelloInterface) Proxy.newProxyInstance(helloInterface.getClass().getClassLoader(),
                helloInterface.getClass().getInterfaces(), invocationHandler);

        proxyHello.sayHello();
    }
}