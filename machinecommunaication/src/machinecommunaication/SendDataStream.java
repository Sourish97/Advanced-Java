package machinecommunaication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class SendDataStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sender Code		
		/*Thread t1 = new Thread(new Runnable(){
					@Override
					public void run() {
						// TODO Auto-generated method stub
						String msg = "\nSourish";
						try {
							Socket s = new Socket(InetAddress.getByName("192.168.1.133"),1050);
							PrintStream ps = new PrintStream(s.getOutputStream());
							ps.println(msg);
							ps.close();
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
				*/
		
		
				//Receiver's Code
				Thread t2 = new Thread(new Runnable(){
					@Override
					public void run() {
						// TODO Auto-generated method stub
						int ch;
						try {
						
							ServerSocket ss = new ServerSocket(1050);
							Socket s = ss.accept();
							BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
							while((ch=br.read())!=-1)
							{
							String msg = (char)ch+br.readLine();
							System.out.println(msg);
							}
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
				});
				t2.start();
				
	}

}
