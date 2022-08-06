package com.HW;

import java.util.*;

public class HJ25 {
    public static void main(String[] args) {
//        System.out.println("3,6,0,123,3,453,7,3,9,453456,13,453,14,123,6,7,1,456,2,786,4,46,8,665,9,453456,11,456,12,786".split(",").length);
        Scanner scanner=new Scanner(System.in);
        TreeSet<Integer> R=new TreeSet<>();
        ArrayList<String> I=new ArrayList<>();
        int nI = scanner.nextInt();
        for (int i=0;i<nI;i++)
        {
            I.add(scanner.next());
        }
        int nR = scanner.nextInt();
        for (int i=0;i<nR;i++)
        {
            R.add(scanner.nextInt());
        }
        ArrayList<Integer> son =new ArrayList<>();
        ArrayList<Integer> result =new ArrayList<>();
        for (int s : R) {
            int count=0;
            for (int j=0;j<I.size();j++){
                if (I.get(j).contains(String.valueOf(s))){
                    son.add(j);
                    son.add(Integer.parseInt(I.get(j)));
                    count++;
                }
            }
            if (count>0){
                result.add(s);
                result.add(count);
                result.addAll(son);
            }
            son.clear();
        }
        System.out.print(result.size()+" ");
        for (Integer integer : result) {
            System.out.print(integer+" ");
        }
    }
}
/**
 * 30 3 6 0 123 3 453 7 3 9 453456 13 453 14 123 6 7 1 456 2 786 4 46 8 665 9 453456 11 456 12 786
 * 0 123 3 453 7 3 9 453456 13 453 14 123 1 456 2 786 4 46 8 665 9 453456 11 456 12 786
 * 0 123 3 453 7 3 9 453456 13 453 14 123 1 456 2 786 4 46 8 665 9 453456 11 456 12 786
 */
