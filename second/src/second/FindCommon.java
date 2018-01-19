package second;
import java.util.*;
public class FindCommon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vector<String> x=new Vector<String>();
		/*HashSet<String> y=new HashSet<String>();
		
		x.add("hello");
		x.add("bye");
		x.add("tata");
		x.add("hi9");
		y.add("hello");
		y.add("hey");
		y.add("do");
		y.add("tata");
		
		x.retainAll(y);
		System.out.println(x);
		*/
		
		x.add("hello");
		x.add("bye");
		x.add("tata");
		x.add("hi9");
		
		Collections.sort(x);
		
		System.out.println(x);
	}

}
