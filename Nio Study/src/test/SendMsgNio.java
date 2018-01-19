package test;

import java.io.IOException;
import java.net.*;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.*;

public class SendMsgNio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread t = new Thread(new Runnable(){

	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		try {
			Scanner sc = new Scanner(System.in);
			String msg = sc.nextLine();
			InetSocketAddress ia = new InetSocketAddress(InetAddress.getLocalHost(),1050);
			SocketChannel soc = SocketChannel.open(ia);
			soc.write(ByteBuffer.wrap(msg.getBytes()));
			sc.close();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
});
t.start();

Thread t2 = new Thread(new Runnable(){

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			ServerSocketChannel ss = ServerSocketChannel.open();
			ss.bind(new InetSocketAddress(InetAddress.getLocalHost(),1050));
			ByteBuffer bb = ByteBuffer.allocate(128);
			SocketChannel sc = ss.accept();
			char ch;
			while(sc.read(bb)!=-1)
			{
				bb.flip();
				while(bb.hasRemaining())
				{
					ch=(char) bb.get();
					System.out.print(ch);
				}
				bb.clear();
			}
			
			ss.close();
			sc.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
});
t2.start();
	}

}
