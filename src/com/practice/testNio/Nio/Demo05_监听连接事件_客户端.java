package com.practice.testNio.Nio;

import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class Demo05_监听连接事件_客户端 {
    public static void main(String[] args) throws Exception {
        // 获取一个客户端的socketChannel
        SocketChannel socketChannel = SocketChannel.open();

        // 设置为非阻塞面模式
        socketChannel.configureBlocking(false);

        // 获取一个Selector选择器
        Selector selector = Selector.open();
        socketChannel.register(selector, SelectionKey.OP_CONNECT);

        // 开启一个新的线程来开启监听任务
            new Thread() {
                @Override
                public void run() {
                    try {
                        while (true) {
                            // 当selector监听到具体的事件后
                            int count = selector.select();

                            if (count == 0) {
                                continue;
                            }
                            // 获取监听的事件集合
                            Set<SelectionKey> selectionKeys = selector.selectedKeys();
                            Iterator<SelectionKey> iterator = selectionKeys.iterator();

                            // 迭代遍历每一个事件
                            while (iterator.hasNext()) {
                                SelectionKey selectionKey = iterator.next();

                                // 判断是否是触发连接事件
                                if (selectionKey.isConnectable()) {
                                    System.out.println("isConnectable");
                                }

                                // 移除事件
                                iterator.remove();
                            }

                            Thread.sleep(1000);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            }.start();

        // 连接服务器(触发连接事件)
        socketChannel.connect(new InetSocketAddress(9999));
    }
}
