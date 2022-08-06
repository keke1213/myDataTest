package com.practice.testNio.Nio.TalkRoom.mypractice;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Scanner;

public class MyTest2_selector改造网络聊天_客户端 {
    public static void main(String[] args) throws Exception {
        SocketChannel socketChannel=SocketChannel.open();
        socketChannel.connect(new InetSocketAddress("127.0.0.1",9999));

        new Thread(){
            @Override
            public void run() {
                ByteBuffer byteBuffer=ByteBuffer.allocate(2048);
                Scanner scanner=new Scanner(System.in);
                while (true){
                    String s = scanner.nextLine();
                    byteBuffer.put(s.getBytes());
                    byteBuffer.flip();
                    try {
                        socketChannel.write(byteBuffer);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }finally {
                        byteBuffer.clear();
                    }

                }
            }
        }.start();



    }
}
