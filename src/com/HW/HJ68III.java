package com.HW;

import java.util.*;

public class HJ68III {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        TreeMap<Integer,ArrayList<String>> source;
        int n = scanner.nextInt();
        int sortType=scanner.nextInt();
        if (sortType==1) source=new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        else source=new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        while (scanner.hasNext()){
            for (int i=0;i<n;i++){
                String name = scanner.next();
                int code = scanner.nextInt();
                if (source.containsKey(code)){
                    ArrayList list = source.get(code);
                    list.add(name);
                    source.put(code,list);
                }else {
                    ArrayList<String> nameList = new ArrayList<>();
                    nameList.add(name);
                    source.put(code,nameList);
                }
            }
            Iterator<Map.Entry<Integer, ArrayList<String>>> iterator = source.entrySet().iterator();
            while (iterator.hasNext()){
                Map.Entry<Integer, ArrayList<String>> next = iterator.next();
                int size = next.getValue().size();
                Integer key = next.getKey();
                ArrayList<String> value = next.getValue();
                for (int i=0;i<size;i++){
                    System.out.println(value.get(i)+" "+key);
                }
            }
        }

    }
}
