package com.FanXin;

import org.omg.PortableInterceptor.INACTIVE;

import java.math.BigDecimal;
import java.util.Arrays;

public class SumTest {
    public static void main(String[] args)   {
        System.out.println(numberSummation(1.1, 2.2));
    }
    public static  <T extends Number>double numberSummation(T t1 ,T t2){
        BigDecimal bigDecimal = new BigDecimal(Double.toString(t1.doubleValue()));
        BigDecimal bigDecimal2 = new BigDecimal(Double.toString(t2.doubleValue()));
        BigDecimal bigDecimal3 = BigDecimal.valueOf(t2.doubleValue());
        return  bigDecimal.add(bigDecimal2).doubleValue();

    }
}
