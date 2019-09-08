package com.lc.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/**
 * ���Ͷ�
 * 1. ʹ��DatagramSocket ָ���˿� �������Ͷ�
 * 2. ׼�����ݣ�һ��Ҫת���ֽ����飩
 * 3. ��װ��DatagramPacket��������Ҫָ��Ŀ�ĵ�
 * 4. ���Ͱ��� send(DatagramPacket p)
 * 5.�ͷ���Դ
 * byte[] getData()
 * 		  getLength()
 * @author Trail
 *
 */
public class UdpClient {

	public static void main(String[] args) throws IOException {
		System.out.println("���ͷ�������");
		
		
		// * 1. ʹ��DatagramSocket ָ���˿� �������Ͷ�
		DatagramSocket client = new DatagramSocket(8888);
		// * 2. ׼�����ݣ�һ��Ҫת���ֽ����飩
		String data= "������";
		byte[] datas = data.getBytes();
		// * 3. ��װ��DatagramPacket��������Ҫָ��Ŀ�ĵ�
		DatagramPacket packet = new DatagramPacket(datas,0,datas.length, new InetSocketAddress("localhost",9999));
		// * 4. ���Ͱ��� send(DatagramPacket p)
		client.send(packet);
		// * 5.�ͷ���Դ
		client.close();
		
	}
	
}