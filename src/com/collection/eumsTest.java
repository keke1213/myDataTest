package com.collection;

import java.util.EnumMap;

public class eumsTest {
    public static void main(String[] args) {
        Conntry conntry=Conntry.America;
//        System.out.println(Conntry.valueOf("America"));
        Conntry[] values = Conntry.values();
        for (Conntry c :
                values) {
            System.out.println(c);
        }
        System.out.println(conntry.compareTo(conntry));




    }
    enum Conntry{
        China,America,Japense;
    }

}
