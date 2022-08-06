package com.practice.testNio.Nio;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * 建立一个监听连接
 * ServerSocketChannel
 */
public class test03 {
    public static void main(String[] args) throws Exception {
        int port=8080;
        ServerSocketChannel serverSocketChannel=ServerSocketChannel.open();
        ByteBuffer byteBuffer=ByteBuffer.wrap("你好任超".getBytes());
        serverSocketChannel.socket().bind(new InetSocketAddress(port));
        serverSocketChannel.configureBlocking(false);
        while (true){
            SocketChannel accept = serverSocketChannel.accept();
            if (accept!=null){
                System.out.println("------"+accept.socket().getRemoteSocketAddress()+"-------");
                byteBuffer.rewind();
                accept.write(byteBuffer);
                accept.close();
            }else {
                System.out.println("=======================");
                Thread.sleep(3000);
            }
        }
    }
}
