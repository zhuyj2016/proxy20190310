package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public interface YJInvocationHandler  {
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
