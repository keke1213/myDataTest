package com.practice.Basic;

import java.io.*;

public class StreamFileIO {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("输入字符, 按下 'q' 键退出。");
//        // 读取字符
//        String  c;
//        do {
//            c = bufferedReader.readLine();
//            System.out.println(c);
//        } while (!"end".equals(c));
//        PrintStream
//        File file = new File("C:/java/hello");

//          InputStream f = new FileInputStream("D:/java/hello.txt");

//         OutputStream f = new FileOutputStream("D:/java/hello.txt");
//         byte[] bytes=new byte[]{1,2,3,4};
//        OutputStreamWriter writer = new OutputStreamWriter(f, "UTF-8");
////         for(int i=0;i<bytes.length;i++){
////             writer.write(bytes[i]);
////         }
//        writer.write("赛大家");
//        writer.write("123");
//
//         writer.close();
//         f.close();
//
//        InputStream fip = new FileInputStream("D:/java/hello.txt");
//        // 构建FileInputStream对象
//
//        InputStreamReader reader = new InputStreamReader(fip, "UTF-8");

//         InputStream f1 = new FileInputStream("D:/java/hello.txt");
//        System.out.println(f1.available());
//        f1.close();

        File filename = new File("D:/java");
//        if(filename.isDirectory()){
//            String[] list = filename.list();
//            for (int i=0;i<list.length;i++){
//                File file = new File(filename+"/"+list[i]);
//                if (file.isDirectory()){
//                    System.out.println(list[i]+"是目录");
//                }else {
//                    System.out.println(list[i]+"是文件");
//                }
//            }
//
//        }
        foreach(filename.toString());
        delete(filename.toString());
        System.out.println("删除完毕");
        foreach(filename.toString());
//        filename.mkdirs();
//        filename.mkdirs();
//        filename.delete();
    }
    public static void delete(String name){
        File filename = new File(name);
        File[] list = filename.listFiles();
        for (int i=0;i<list.length;i++){
        if (list[i].isDirectory()){
            delete(list[i].toString());
        }else {
            list[i].delete();
        }
        }
        filename.delete();
    }
    public static void foreach(String name){
        File filename = new File(name);
        
        if(filename.isDirectory()){
            String[] list = filename.list();
            for (int i=0;i<list.length;i++){
                File file = new File(filename+"/"+list[i]);
                if (file.isDirectory()){
                    System.out.println(list[i]+"是目录");
                    foreach(file.toString());
                }else {
                    System.out.println(list[i]+"是文件");
                }
            }

        }
    }
}
