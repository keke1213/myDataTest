package com.HW;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class HJ101II {

    public static void main(String[] args) throws IOException {
        Scanner br = new Scanner(System.in);
        int n=br.nextInt();
        ArrayList<Integer> arr=new ArrayList();
        for(int i=0;i<n;i++){
            arr.add(br.nextInt());
        }
        int sort=br.nextInt();
        Collections.sort(arr);
        if(sort==1){
            Collections.reverse(arr);
        }
        arr.forEach(e->{
            System.out.print(e+" ");}
        );
    }
}