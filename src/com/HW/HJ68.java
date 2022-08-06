package com.HW;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;
import java.util.stream.Stream;

public class HJ68 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        HashSet<Integer> hashSet=new HashSet<>();
//        ArrayList arrayList =new ArrayList();
        int n = scanner.nextInt();
        scanner.hasNext();
            int sort = scanner.nextInt();
        HashMap<Integer,ArrayList> hashMap=new HashMap<>();
            for (int i=0;i<n;i++){
                String name = scanner.next();
                int source = scanner.nextInt();
                if (hashSet.contains(source)){
                    ArrayList arrayList = hashMap.get(source);
                    arrayList.add(name);
                    hashMap.put(source,arrayList);
                }else {
                    hashSet.add(source);
                    ArrayList<String> arrayList=new ArrayList();
                    arrayList.add(name);
                    hashMap.put(source,arrayList);
                }
            }
            Stream<Map.Entry<Integer, ArrayList>> stream = hashMap.entrySet().stream();
            Stream<Map.Entry<Integer, ArrayList>> sorted ;
            if (sort==0){
                sorted=stream.sorted(new Comparator<Map.Entry<Integer, ArrayList>>() {
                    @Override
                    public int compare(Map.Entry<Integer, ArrayList> o1, Map.Entry<Integer, ArrayList> o2) {
                        return o2.getKey()-o1.getKey();
                    }
                });
            }else {
                 sorted = stream.sorted(new Comparator<Map.Entry<Integer, ArrayList>>() {
                     @Override
                     public int compare(Map.Entry<Integer, ArrayList> o1, Map.Entry<Integer, ArrayList> o2) {
                         return o1.getKey()-o2.getKey();
                     }
                 });
            }
            Iterator<Map.Entry<Integer, ArrayList>> iterator = sorted.iterator();
            while (iterator.hasNext()){
                Map.Entry<Integer, ArrayList> next = iterator.next();
                int size = next.getValue().size();
                for (int i=0;i<size;i++){
                    System.out.println(next.getValue().get(i)+" "+next.getKey());
                }
            }
//            stream.close();
        }

}
