package com.practice.testNio.Nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.*;
import java.util.Iterator;

/**
 * Selector选择器
 */
public class Test02   {


    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocketChannel serverSocketChannel=ServerSocketChannel.open();//创建连接
        serverSocketChannel.bind(new InetSocketAddress(9999));//绑定端口
        serverSocketChannel.configureBlocking(false);//非堵塞模式
        Selector selector=Selector.open();//选择器
        serverSocketChannel.register(selector,SelectionKey.OP_ACCEPT);//注册

        while (true){
            int count=selector.select();
            System.out.println("count:"+count);
            Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
//            while (iterator.hasNext()){
//                SelectionKey next = iterator.next();
//            }
            Thread.sleep(1000);
        }
    }
}
