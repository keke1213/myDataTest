package com.practice.Basic;

public class BasicData {
    public static void main(String[] args) {
        byte a=1;
        int b=a;
        long c=1;
        b= (int) c;
        double f= 3.4;
        float d= 3.4f;
        float e= (float) 3.4;
        test01 test01 = new test01(1);
        
    }
    protected static class  test01{
        private int age;

        public test01(int age) {
            this.age = age;
        }
    }
}
