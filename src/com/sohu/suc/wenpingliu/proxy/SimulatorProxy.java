package com.sohu.suc.wenpingliu.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: wenpingliu
 * Date: 13-3-2
 * Time: 下午3:34
 * To change this template use File | Settings | File Templates.
 */
final public class SimulatorProxy implements Simulator{

    protected InvocationHandler handler;

    public SimulatorProxy( InvocationHandler handler){
        this.handler = handler;
    }

    @Override
    public int processSimulate(int length) {
        Method method = null;
        try {
            method.getClass().getMethod("processSimulate",new Class[]{int.class});
        } catch (NoSuchMethodException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        Object r = null;
        try {
            r = handler.invoke(this,method,new Object[]{new Integer(length)});
        } catch (Throwable throwable) {
            throwable.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        return (Integer)r;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
