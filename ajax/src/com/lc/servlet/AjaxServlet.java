package com.lc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//web3.0ʹ��ע���������xml�ļ�
@WebServlet("/ajax")
public class AjaxServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//������������ʽ
		req.setCharacterEncoding("utf-8");
		//������Ӧ�����ʽ
		resp.setContentType("text/html;charset=utf-8");
		//��ȡ������Ϣ
		String name = req.getParameter("name");
		String pwd= req.getParameter("pwd");
		System.out.println(name+":"+pwd+":"+req.getMethod());
		//����������Ϣ
		//��Ӧ�������
		resp.getWriter().write("�������");
		
	}	
}