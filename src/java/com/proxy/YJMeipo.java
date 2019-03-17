package com.proxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class YJMeipo implements YJInvocationHandler {
    private Object target;

    public Object getInstance(Object target){
        this.target=target;
        return YJProxy.newProxyInstance(new YJClassLoader(),target.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("我是媒婆，开始帮你物色对象");
        return method.invoke(target,args);
    }
}
