package com.practice.Basic;
//测试泛型
public class GenericMethodTest {
    public static void main(String[] args) {
        Integer[] i ={1,2,3,4};
        foreach(i);
        re rc =new re<Character>('1');
    }
    public static <E,T,K> E foreach(E[] es){
        for (E data:es
             ) {
            System.out.println(data);
        }
        return null;
    }
    //泛型类
    static class re<String>{
        private String name;
        private Integer age;

        public re(String name) {
            this.name = name;
        }
    }

    public static <T extends Comparable<T>> T maximum(T x, T y, T z)
    {
        T max = x; // 假设x是初始最大值
        if ( y.compareTo( max ) > 0 ){
            max = y; //y 更大
        }
        if ( z.compareTo( max ) > 0 ){
            max = z; // 现在 z 更大
        }
        return max; // 返回最大对象
    }
}
