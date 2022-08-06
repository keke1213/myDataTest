package com.practice.testNio.Nio.TalkRoom;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class Test1_selector改造网络聊天_服务端 {

    public static void main(String[] args) throws Exception {

        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.bind(new InetSocketAddress("127.0.0.1", 9999));

        Selector selector = Selector.open();
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

        System.out.println("等待客户端连接....");

        ByteBuffer buffer = ByteBuffer.allocate(1024);

        while (true) {
            if (selector.select() == 0) {
                continue;
            }

//            Set<SelectionKey> keys = selector.selectedKeys();
//            Iterator<SelectionKey> iterator = keys.iterator();
            Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
            while (iterator.hasNext()) {

                SelectionKey selectionKey = iterator.next();

                if (selectionKey.isAcceptable()) {
                    // 代表有客户端连接了
                    SocketChannel socketChannel = serverSocketChannel.accept();       // 获取触发连接事件的那个客户端
                    socketChannel.configureBlocking(false);

                    // 注册读事件到Selector上
                    socketChannel.register(selector, SelectionKey.OP_READ);

                    System.out.println("客户端【" + socketChannel.getRemoteAddress() + "】连接成功..");
                } else if (selectionKey.isReadable()) {

                    // 触发读事件,代表客户端发送信息到服务端了
                    SocketChannel socketChannel = (SocketChannel) selectionKey.channel();       // 获取触发连接事件的那个客户端

                    socketChannel.read(buffer);

                   // limit=position,position=0
                    buffer.flip();

                    System.out.println("客户端【" + socketChannel.getRemoteAddress() + "】的数据: " + new String(buffer.array(), 0, buffer.array().length));
                }

                // 处理完逻辑后移除事件
                iterator.remove();
            }
        }
    }
}
