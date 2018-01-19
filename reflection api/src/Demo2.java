import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;
class Emp
{
	private String name;
	public int id;
	protected double sal;
	
	public Emp(){
		
	}
	
	public Emp(int id,String name,double sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	
	protected void Set(int id,String name,double sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	
	protected void SetName(String name){
		this.name=name;
	}

	public String toString(){
		return id+"\t"+name+"\t"+sal;	
	}
	
	protected void say(){
		System.out.println("Hello"+name);
	}
	
}


public class Demo2 {
	
	static void find(Class<?> c,List<String> y){
		if(c.getSimpleName().equals("Object"))
			add(y,c);
		else{
			add(y,c);
			find(c.getSuperclass(),y);
		}
	}
	
	static void add(List<String> x, Class<?> c){
		for(Method m:c.getDeclaredMethods())
			x.add(m.getName());
	}
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException{
		// TODO Auto-generated method stub
//		Emp x=new Emp();
//		Class c1=x.getClass();
//		Class c2=Class.forName("Emp");
//		Class c3=Emp.class.getClass();
//		System.out.println(c1);
//		System.out.println(c2);
//		System.out.println(c3);
//		Method a[]=c1.getDeclaredMethods();
//		for(Method m:a){
//			if(m.getName().equals("Set"));
//			m.invoke(x, new Integer(1),"ABC",new Double(99.0));
//			}
//			
			
		/*Class c=Class.forName("Emp");
		Emp x = (Emp)c.newInstance();
		x.Set(1, "ABC", 7000);
		Method m = c.getMethod("toString");
		System.out.println(m.invoke(x));*/

		
	//Class<?> c=Emp.class;
//	Class<?> c=Class.forName("Emp");
//	Emp x = (Emp)c.newInstance();
//	Method m = c.getDeclaredMethod("Set",new Class[]{int.class,String.class,double.class});	
//	m.setAccessible(true);//to access private members
//	m.invoke(x,101,"abc",99);
//	System.out.println(x);
	
		/*Class<?> c=Class.forName("Emp");
		Emp x = (Emp)c.newInstance();
		x.Set(1, "XYZ", 9000);
		
		Field f = x.getClass().getDeclaredField("name");	
		f.setAccessible(true);//to access private members
		f.set(x,"ABC");
		System.out.println(x);
		*/
		
		//Class<?> c=Class.forName("Demo2");
		//System.out.println(Modifier.toString(c.getModifiers()));
		
		Class<?> c=Class.forName("Emp");
		ArrayList<String> x=new ArrayList<String>();
		ArrayList<String> y=new ArrayList<String>();
		add(x,c);
		find(c.getSuperclass(),y);
	    y.retainAll(x);
		System.out.println(y);
	}

}
