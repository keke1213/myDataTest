package com.collection;

import java.util.Map;

public class Products {
    Map<String, Integer> storage;
    Map<String, Integer> sale;

    // write your code here

    public Products(Map<String, Integer> storage, Map<String, Integer> sale) {
        this.sale=sale;
        this.storage=storage;
    }

    public boolean onSale(String key, int n) {
        if (!storage.containsKey(key)|n==0|storage.get(key)==0){
            return false;
        }
        Integer num = storage.get(key);
        if (n>num){
            Integer salSum = sale.get(key);
            if (salSum==null)salSum=0;
            storage.put(key,0);
            sale.put(key,num+salSum);
        }else {
            this.storage.put(key,num-n);
            Integer salSum = sale.get(key);
            if (salSum==null){
                sale.put(key,n);
            }else {
                this.sale.put(key,salSum+n);
            }

        }
        return true;
    }
    
    public int sellOut(String key, int n) {
        Integer salSum = sale.get(key);
        if (salSum==null){
            return 0;
        }
        if (salSum>n){
            sale.put(key,salSum-n);
            return n;
        }else {
            sale.remove(key);
            return salSum;
        }
    }
    
    public String readStorage() {
        return storage.toString();
    }
    public String readSale() {
        return sale.toString();
    }
}