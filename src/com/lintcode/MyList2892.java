package com.lintcode;

import java.util.ArrayList;
import java.util.List;

public class MyList2892 {
   List<Integer> list=new ArrayList<Integer>();

   public void add(int value){
       list.add(value);
   }
   public int remove(){
       return list.remove(list.size()-1);
   }
   public void show(){
       String.valueOf(list);
       System.out.println(list);
   }
}
