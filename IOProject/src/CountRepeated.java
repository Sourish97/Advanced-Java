import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeMap;

public class CountRepeated {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader f=new BufferedReader(new FileReader("/home/neebal/Desktop/lorem.txt"));
		TreeMap<String,Integer> x=new TreeMap<String,Integer>();
		String s;
		while((s=f.readLine())!=null){
			String a[]=s.split(" ");
			for(int i=0;i<a.length;i++){
				if(x.get(a[i])!=null)
					x.put(a[i],x.get(a[i]+1));
				else x.put(a[i],1);
			}
		}
		Set<String> se=x.keySet();
		for(String key:se)
			System.out.println(key+" : "+x.get(key));
		f.close();
		
	}

}
