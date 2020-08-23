package com.yc.tomcat.core;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StartTomcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new StartTomcat().start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@SuppressWarnings("resource")
	private void start() throws IOException{
		int port = Integer.parseInt(ReadConfig.getInstance().getProperty("port"));
		
		ServerSocket ssk = new ServerSocket(port);
		
		System.out.println("服务器启动成功，端口为：" + port);
		
		new ParseUrlPattern();
		
		new ParseXml();
		
		ExecutorService serviceThread = Executors.newFixedThreadPool(20);
		
		Socket sk = null;
		while(true) {
			sk = ssk.accept();
			
			serviceThread.submit(new ServerService(sk));
		}
	}

}
