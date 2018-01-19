package machinecommunaication;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class SendData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Sending Code
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				byte a[] = "Hello to all".getBytes();
				try {
				DatagramPacket dp = new DatagramPacket(a,a.length,InetAddress.getByName("192.168.1.133"),1050);
				DatagramSocket ds = new DatagramSocket();
				ds.send(dp);
				} catch (SocketException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (UnknownHostException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t1.start();
		
		
		//Receiver Code
		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				byte a[] = new byte[128];
				DatagramPacket dp = new DatagramPacket(a,a.length);
				DatagramSocket ds;
				try {
					ds = new DatagramSocket(1050);
					ds.receive(dp);
				} catch (SocketException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(new String(a));
			}
			
		});
		t2.start();
	}

}
