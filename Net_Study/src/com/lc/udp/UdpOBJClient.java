package com.lc.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/**
 * 引用类型 发送端
 * 1. 使用DatagramSocket 指定端口 创建发送端
 * 2. 准备数据（一定要转成字节数组）
 * 3. 封装成DatagramPacket包裹，需要指定目的地
 * 4. 发送包裹 send(DatagramPacket p)
 * 5.释放资源
 * byte[] getData()
 * 		  getLength()
 * @author Trail
 *
 */
public class UdpOBJClient {

	public static void main(String[] args) throws IOException {
		System.out.println("发送方启动中");
		
		
		// * 1. 使用DatagramSocket 指定端口 创建发送端
		DatagramSocket client = new DatagramSocket(8888);
		// * 2. 准备数据（一定要转成字节数组）
		
		
		
		
		// * 3. 封装成DatagramPacket包裹，需要指定目的地
		DatagramPacket packet = new DatagramPacket(datas,0,datas.length, new InetSocketAddress("localhost",9999));
		// * 4. 发送包裹 send(DatagramPacket p)
		client.send(packet);
		// * 5.释放资源
		client.close();
		
	}
	
}
