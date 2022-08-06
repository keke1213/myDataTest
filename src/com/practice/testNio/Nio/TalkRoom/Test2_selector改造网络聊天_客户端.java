package com.practice.testNio.Nio.TalkRoom;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.Scanner;

public class Test2_selector改造网络聊天_客户端 {
    public static void main(String[] args) throws Exception {
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.connect(new InetSocketAddress("127.0.0.1", 9999));

        // 写线程
        new Thread() {
            @Override
            public void run() {

                try {
                    Scanner scanner = new Scanner(System.in);

                    // 用于封装要发送给客户端的数据
                    ByteBuffer buffer = ByteBuffer.allocate(1024);

                    while (true) {
                        String str = scanner.nextLine();
                        buffer.put(str.getBytes());

                        // limit=position, position=0
                        buffer.flip();

                        socketChannel.write(buffer);

                        // position=0,limit=capacity
                        buffer.clear();
                    }
                } catch (IOException exception) {
                    exception.printStackTrace();
                }

            }
        }.start();

    }
}
