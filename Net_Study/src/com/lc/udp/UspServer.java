package com.lc.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * ���ն�
 * 1. ʹ��DatagramSocket ָ���˿� �������ն�
 * 2. ׼����������װ��DatagramPacket
 * 3. ����ʽ���հ��� receive(DatagramPacket p)
 * 4. ��������
 * byte[] getData()
 * 		  getLength()
 * 5.�ͷ���Դ
 * @author Trail
 */
public class UspServer {
	public static void main(String[] args) throws IOException {
		System.out.println("���շ�������");
		
		 //* 1. ʹ��DatagramSocket ָ���˿� �������ն�
		DatagramSocket server = new DatagramSocket(9999);
		// * 2. ׼����������װ��DatagramPacket
		byte[] container = new byte[1024*60]; //60k
		DatagramPacket packet = new DatagramPacket(container, 0 ,container.length);
		// * 3. ����ʽ���հ��� receive(DatagramPacket p)
		server.receive(packet);
		// * 4. ��������
		byte[] datas = packet.getData();
		int len = packet.getLength();
		System.out.println(new String(datas,0,len));
		 //* 5.�ͷ���Դ
		server.close();
	}
}