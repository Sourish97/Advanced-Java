package second;
import java.util.*;

/*class Employee{
	static Hashtable<Integer,HashSet<String>> emp=new Hashtable<Integer,HashSet<String>>();
	
	
	void set(int id,String e_name,String e_desig){
		HashSet<String> x=new HashSet<String>();
		x.add(e_name);
		x.add(e_desig);
		emp.put(id,x);
	}
	
	HashSet<String> get(int i){
		HashSet<String> a=emp.get(i);
		return a;
		
	}
}
*/
class Emp implements Comparable<Emp>{
	int id;
	String name,desig;
	Emp(int i,String n,String d)
	{
		id=i;
		name=n;
		desig=d;
	}
	
	int getId(){
		return id;
	}
	
	String getName(){
		return name;
	}
	
	public int compareTo(Emp t){
		return name.compareTo(t.name);
	}
		public String toString(){
			return id+"\t"+name+"\t"+desig;
		
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Employee e=new Employee();
		e.set(1, "A","Manager");
		e.set(2, "B","WORKER");
		e.set(3, "C","Manager");
		e.set(4, "D","intern");
		e.set(5, "E","worker");
		HashSet<String> x=e.get(5);
		System.out.println(x);
		*/
		Emp a= new Emp(10,"Hari","D1");
		Emp b= new Emp(13,"om","D2");
		Emp c= new Emp(3,"Akash","D3");
		Emp d= new Emp(40,"Sourish","D1");
		
		ArrayList<Emp> x = new ArrayList<Emp>();
		x.add(a);
		x.add(b);
		x.add(c);
		x.add(d);
		
		Collections.sort(x);
		for(Emp t:x)
			System.out.println(t);
	}

}
