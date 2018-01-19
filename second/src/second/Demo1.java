package second;
import java.util.*;
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*PriorityQueue<Integer> x= new PriorityQueue<Integer>(20,new Comparator<Integer>(){
	public int compare(Integer x,Integer y)
	{
		if(x>y)
			return -1;
		if(x<y)
			return 1;
		else
			return 0;
	}
});
*/
		HashMap<String,Integer> x= new HashMap<String,Integer>();
x.put("Hello",34);
x.put("Bye",4);
x.put("hi",8);
x.put("good",78);
x.put("all",43);
System.out.println(x);

/*while(!x.isEmpty()){
System.out.println(x.remove());	
}
*/
	}

}
