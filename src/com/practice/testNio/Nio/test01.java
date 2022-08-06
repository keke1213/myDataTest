package com.practice.testNio.Nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * ByteBuffer和FileChannel
 */
public class test01 {
    public static void main(String[] args) throws Exception {
        ByteBuffer byteBuffer=ByteBuffer.allocate(1024);//分配一个缓冲区1024字节
//
        byteBuffer.put((byte) 123);
        byteBuffer.put((byte) 12);
        byteBuffer.flip();//写模式变改模式
        System.out.println("p:"+byteBuffer.position()+" l:"+byteBuffer.limit()
        +"容量大小c:"+byteBuffer.capacity());
//        byte b  =21;
        byteBuffer.hasRemaining();//是否还有
        System.out.println("1:"+byteBuffer.get());
        System.out.println("2:"+byteBuffer.get());

        System.out.println("p:"+byteBuffer.position()+" l:"+byteBuffer.limit()
                +"容量c:"+byteBuffer.capacity());

//        FileChannel fi = new FileInputStream("").getChannel();//文件路径

//        FileChannel fo = new FileOutputStream("").getChannel();//文件路径

//        while (fi.read(byteBuffer)!=-1){
//            byteBuffer.flip();
//            fo.write(byteBuffer);
//            byteBuffer.clear();
//        }
//        fi.close();
//        fo.close();


    }
}
