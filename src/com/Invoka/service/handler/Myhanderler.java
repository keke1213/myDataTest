package com.Invoka.service.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Myhanderler  implements InvocationHandler {
    //可以动态获取到目标类
    Object target=null;

    public Myhanderler(Object object) {
        this.target = object;
    }

    //在这里实现功能增强
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object res=null;
        res=method.invoke(target,args);
        if (res!=null){
            System.out.println("动态代理实现成功");
            return 1;
        }
        return 0;
    }
}
