package com.collection;

import sun.security.provider.MD5;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        List<Student> list  = new ArrayList<>();
//        String in = sc.nextLine().trim();
//        String[] str = in.replace("[", "").replace("]", "").split(",");
//        if (str.length > 0 && !"".equals(str[0])) {
//            list = Arrays.stream(str).map(s -> {
//                String[] stu = s.trim().split(":", 2);
//                return new Student(stu[0], Integer.parseInt(stu[1]));
//            }).collect(Collectors.toList());
//        }
//
//        System.out.println(Solution.getSortMap(list));
//
//        sc.close();

        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();
        String in = sc.nextLine().trim();
        String[] str = in.replace("[", "").replace("]", "").split(",");

        for (String s : str) {
            String[] entry = s.trim().split(":", 2);
            map.put(entry[0], Integer.parseInt(entry[1]));
        }

        System.out.println(Solution.sortMap(map));

        sc.close();
    }
    public static  Map<Student, Integer> getSortMap(List<Student> list) {
        // write your code here
        Map<Student , Integer> h = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.age==o2.age){
                    return o1.name.compareTo(o2.name);
                }
                else if(o1.age<o2.age){
                    return -1;
                }
                else {
                    return 1;

                }
            }
        });
        Iterator<Student> iterator = list.iterator();
        int i=0;
        while (iterator.hasNext()){
            h.put(iterator.next(),i++);
        }

        return h;
    }


    public static Map<String, Integer> sortMap(Map<String, Integer> map)  {
        // write your code here
//        TreeMap<String, Integer> hashMap = new TreeMap<>(map);
//        return hashMap;


        List<Map.Entry<String,Integer>> m = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
        m.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });

        return null;
    }












//    http://cos.ap-chengdu.myqcloud.com/anquan-1251001081/upload/753681a4ee0b11ec9a210242ac110003.html?bt=454+%289%29#2e56dc12c27a19689e7c368d39669cb169deeb71.m3u8
//        http://cos.ap-chengdu.myqcloud.com/anquan-1251001081/upload/753681a4ee0b11ec9a210242ac110003.html?bt=454+%287%29#12d3bbe476cc59b7154a6e6ee5b62105d12b5d84.m3u8

//    c4ca4238a0b923820dcc509a6f75849b  密码:1
//    2e56dc12c27a19689e7c368d39669cb169deeb71 密码:
    //2e56dc12c27a19689e7c368d39669cb169deeb71


//
//    System.out.println("2e56dc12c27a19689e7c368d39669cb169deeb71".substring(0,16));
//    StringBuilder s1 =new StringBuilder("2e56dc12c27a19689e7c368d39669cb169deeb71");
//        System.out.println(md5(s1.toString()));
    public static String md5(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            //BigInteger作用：将8位的字符串，转换为16位的字符串
            //得到的16位字符串的哈希码值
            //参数1：1  正数  0  0   -1  负数
            return new BigInteger(1, messageDigest.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

}