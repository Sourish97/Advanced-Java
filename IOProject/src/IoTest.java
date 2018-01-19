import java.io.*;
public class IoTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			InputStreamReader isr=new InputStreamReader(System.in);
			LineNumberReader br=new LineNumberReader(isr);
			String s="";
			while(!s.equals("-1")){
				s=br.readLine();
			}
			System.out.println("no. of inputs="+(br.getLineNumber()-1));
	}

}
