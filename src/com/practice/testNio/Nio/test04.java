package com.practice.testNio.Nio;
import org.junit.Test;

import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
public class test04 {
        @Test
        public void server() throws Exception {

            // 创建一个服务器
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();

            // 绑定地址
            serverSocketChannel.bind(new InetSocketAddress(9999));

            // 设置为非阻塞模式
            serverSocketChannel.configureBlocking(false);

            // 获取一个选择器
            Selector selector = Selector.open();

        /*
            注册事件:
                * 读 : SelectionKey.OP_READ （1）
                * 写 : SelectionKey.OP_WRITE （4）
                * 连接 : SelectionKey.OP_CONNECT （8）
                * 接收 : SelectionKey.OP_ACCEPT （16）
         */
            serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

            while (true) {

            /*
                获取有多少通道已经就绪(包括连接就绪/接受就绪/读就绪/写就绪等)
                select方法将会一直阻塞到至少要有一个通道在注册的事件上就绪(返回1),之后将会一直轮询调用select方法获取就绪的事件数量
             */
                int count = selector.select();

                System.out.println("count: " + count);

                Thread.sleep(1000);
            }
        }
        @Test
        public void client() throws Exception {
            SocketChannel socketChannel = SocketChannel.open();

            // 连接服务器
            socketChannel.connect(new InetSocketAddress(9999));


            System.out.println("连接成功");

        }
        @Test
        public void client1() throws Exception {
            SocketChannel socketChannel = SocketChannel.open();

            // 连接服务器
            socketChannel.connect(new InetSocketAddress(9999));

            System.out.println("连接成功");
        }
    }



