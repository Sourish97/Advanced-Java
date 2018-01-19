package first;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class NumDemo {
	
	public static <T extends AbstractList<?>>void display(T x)
	{
			Iterator<?> i=x.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector<String> s = new Vector<String>();
s.add("one");
s.add("two");
s.add("three");
s.add("four");
s.add("five");

ArrayList<Integer> a = new ArrayList<Integer>();
a.add(1);
a.add(2);
a.add(3);
a.add(4);
a.add(5);

Stack<Double> d = new Stack<Double>();
d.push(10.0);
d.push(20.0);
d.push(30.0);
d.push(40.0);
d.push(50.0);

NumDemo.<ArrayList<?>>display(a);
NumDemo.<Vector<?>>display(s);
NumDemo.<Stack<?>>display(d);




	}

}
