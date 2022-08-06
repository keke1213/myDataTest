package com.HW;


import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class HJ33II{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        str=br.readLine();
        Long vlaue=0l;
        for(String s: str.split("\\.")){
            vlaue=vlaue*256+Integer.parseInt(s);
        }
        Long read;
        read=Long.parseLong(br.readLine());
        str="";
        while(read>0){
            str="."+read%256+str;
            read/=256;
        }
        str =str.substring(1);
        System.out.print(vlaue+"\n"+str);
    }
}