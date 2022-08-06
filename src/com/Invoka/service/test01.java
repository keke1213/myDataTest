package com.Invoka.service;

import com.Invoka.service.handler.Myhanderler;
import com.Invoka.service.imp.SayImp;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

public class test01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {
        Say say=new SayImp();
//        Class<Say> sayClass = Say.class;
//        Method sayHi = sayClass.getMethod("SayHi", String.class);
//        sayHi.invoke(say,"123");



        InvocationHandler my =new Myhanderler(say);
        Say o =(Say) Proxy.newProxyInstance(say.getClass().getClassLoader(), say.getClass().getInterfaces(), my);
        o.SayHi("123");
    }
}
