package com.practice.testNio.Nio;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Scanner;

public class NIOClient {
// Selector serverSelector = Selector.open();
 public static final int CAPACITY = 1024;
 public static void main(String[] args) throws Exception {
       ByteBuffer dsts = ByteBuffer.allocate(CAPACITY);
       SocketChannel socketChannel = SocketChannel.open(new InetSocketAddress("127.0.0.1", 3333));
       socketChannel.configureBlocking(false);//非阻塞模式 在服务端使用通常
//  ServerSocket serverSocket=new ServerSocket();
//  ServerSocketChannel channel = serverSocket.getChannel();

     Scanner sc = new Scanner(System.in);
       while (true) {
       String msg = sc.next();
       dsts.put(msg.getBytes());
       dsts.flip();
       socketChannel.write(dsts);
       dsts.clear();
 }
 }
}