package com.practice.testNio.Nio;

import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;

public class Demo04_监听连接事件_服务端 {
    public static void main(String[] args) throws Exception {

        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.bind(new InetSocketAddress(8888));
        serverSocketChannel.accept();
        while (true) {

        }
    }
}
