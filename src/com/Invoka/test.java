package com.Invoka;

import com.Invoka.service.Say;
import com.Invoka.service.handler.Myhanderler;
import com.Invoka.service.imp.SayImp;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class test {
    public static void main(String[] args)throws Exception {
        Say say=new SayImp();
//        Say say2=new SayImp();
//        Class sayClass = Say.class;

        /**
         * String name, Class<?>... parameterTypes
         */
//        Method sayHi = Say.class.getMethod("SayHi", String.class);
//        Method SayBye = Say.class.getMethod("SayBye", String.class, String.class);
        /**
         *  Object obj, Object... args
         */
//        Object ni = sayHi.invoke(say, "你好");
//        System.out.println(ni);
//        SayBye.invoke(say2,"任超","拜拜");

        /**
         * public Object invoke(Object proxy, Method method, Object[] args)
         */

        InvocationHandler invocationHandler=new Myhanderler(say);
        /**
        * 为谁代理 实现接口 对象
        * public static Object newProxyInstance(ClassLoader loader,
        * Class<?>[] interfaces, InvocationHandler h)
        * 返回代理对象
        */
        Say o = (Say) Proxy.newProxyInstance(say.getClass().getClassLoader(), say.getClass().getInterfaces(), invocationHandler);
        System.out.println();

        o.SayBye("123","321");
        o.SayHi("hi");

//        Proxy proxy =new Myhanderler(,Say.class.getInterfaces(),"你好","拜拜");
    }
}
