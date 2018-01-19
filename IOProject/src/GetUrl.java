import java.io.*;
import java.net.*;
public class GetUrl {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			URL a = new URL("https://www.google.co.in/?gfe_rd=cr&ei=budMWY6VDtSFrAH3xbmYCA");
			InputStream x =a.openStream();
			InputStreamReader ir=new InputStreamReader(x);
			BufferedReader br = new BufferedReader(ir);
			FileWriter fw=new FileWriter(new File("/home/neebal/Desktop/google.html"));
			String s;
			while((s=br.readLine())!=null)
				fw.write(s);
			fw.close();
			br.close();
			ir.close();
			
	}

}
