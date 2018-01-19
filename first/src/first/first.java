package first;
//class Num <T extends Number & Comparable<T>>
class Num <T>
{
	T x;
	Num()
	{
		
	}
	
	Num(T t)
	{
		x=t;
	}
	
	static <T> void display(T j)
	{
		System.out.println("Output "+j);
	}
	void set(T t)
	{
		x=t;
	}
	
	T get()
	{
		return x;
	}
	
	public String toString()
	{
		return x+" ";
	}
}
public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Num<? extends Number> a=new Num<Integer>(5);
		Num<? super Number> a=new Num<Object>(5);
		int t=(Integer)a.get();
		//a.set(20);
		System.out.println(t+"\t"+a);
		Num<Double> b = new Num<>(25.5);
		double d =b.get();
		
		Num<String> c=new Num<>("Hello");
		String s=c.get();
		String s1=b.get().toString();
		
		System.out.println(s+"\t"+s1);
		
		Num.<String>display("Hi");
		Num.<Num>display(a);
	}

}
