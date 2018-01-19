package first;
import java.util.*;

class AddList<T extends Number>{
	ArrayList<T> e=new ArrayList<T>();
	
	void set(T s){
		e.add(s);
	}
	
	String addA(){
		int s=0;
		String x="";
		Iterator<T> i=e.iterator();
		while(i.hasNext()){
			if(i.next() instanceof Integer)
				s+=i.next();
		}
		
	
}
public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
