package com.lc.udp;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * �������ͽ��ն�
 * 1. ʹ��DatagramSocket ָ���˿� �������ն�
 * 2. ׼����������װ��DatagramPacket
 * 3. ����ʽ���հ��� receive(DatagramPacket p)
 * 4. �������ݣ����ֽ����黹ԭΪ��Ӧ�����ͼ���
 * byte[] getData()
 * 		  getLength()
 * 5.�ͷ���Դ
 * @author Trail
 */
public class UspTypeServer {
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
		DataInputStream dis = new DataInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)));
		
		String msg = dis.readUTF();
		int age= dis.readInt();
		boolean flag = dis.readBoolean();
		char ch = dis.readChar();
		System.out.println(len + "  "+msg +"  "+ age +"  "+ flag +"  " + ch);
		 //* 5.�ͷ���Դ
		server.close();
	}
}