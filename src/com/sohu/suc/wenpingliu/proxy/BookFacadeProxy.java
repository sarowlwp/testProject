package com.sohu.suc.wenpingliu.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 * User: wenpingliu
 * Date: 13-3-2
 * Time: 下午4:26
 * To change this template use File | Settings | File Templates.
 */
public class BookFacadeProxy implements InvocationHandler {

    private Object target;

    public Object bind(Object target){
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        //do something
        result = method.invoke(target,args) ;
        //do something after
        return result;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
