package com.practice.testNio.Nio.TalkRoom.mypractice;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

public class MyTest1_selector改造网络聊天_服务端 {
    public static void main(String[] args) throws Exception {
        ByteBuffer byteBuffer=ByteBuffer.allocate(2048);
        ServerSocketChannel serverSocketChannel=ServerSocketChannel.open();
        serverSocketChannel.bind(new InetSocketAddress("127.0.0.1",9999));
        serverSocketChannel.configureBlocking(false);
        Selector selector=Selector.open();
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        System.out.println("等待客户端连接.....");
        while (true){
            if (selector.select()==0)continue;
            Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
            while (iterator.hasNext()){
                SelectionKey next = iterator.next();
                if (next.isAcceptable()){
                    SocketChannel accept = serverSocketChannel.accept();
                    accept.configureBlocking(false);
                    accept.register(selector,SelectionKey.OP_READ);
                    System.out.println("客户端【"+accept.getRemoteAddress()+"】:正在连接......");
                }else if (next.isReadable()){
                    SocketChannel accept = (SocketChannel) next.channel();
                    accept.read(byteBuffer);
                    byteBuffer.flip();
                    System.out.println("客户端【"+accept.getRemoteAddress()+"】:"+new String(byteBuffer.array(),0,byteBuffer.array().length));
                    byteBuffer.clear();
                }
                //记得删除事件
                iterator.remove();
            }

        }

    }
}
