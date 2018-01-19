import java.io.*;
import java.util.Scanner;
public class PipeExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		PipedReader reader = new PipedReader();
		PipedWriter writer = new PipedWriter(reader);
		
		new Thread(new Runnable(){
				public void run(){
					String s;
			try {
				while(!((s=sc.nextLine()).equals("end")))
				writer.write(s+"\n");
				writer.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}).start();
		
		new Thread(new Runnable(){
			public void run(){
				String s;
				try {
					FileWriter fw=new FileWriter("/home/neebal/Desktop/demo.txt");
					PrintWriter pw = new PrintWriter(fw);
					BufferedReader br = new BufferedReader(reader);
					while((s=br.readLine())!=null)
						pw.println(s);
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
	}

	
}
