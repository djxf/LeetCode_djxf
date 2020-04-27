package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理dome
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