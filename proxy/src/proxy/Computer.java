package proxy;

public class Computer implements Cloneable{
	String sname,name;
	int hd,ram;
	boolean webServer;
	Computer(){
		
	}
	Computer(String n,int h,int r){
		name=n;
		hd=h;
		ram=r;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		Computer c = new Computer(name,hd,ram);
		return c;
	}
	
	public String toString(){
		return name+"\t"+hd+"\t"+ram;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Computer c= new Computer("Apple",500,4);
		Computer d = (Computer) c.clone();
		System.out.println(c);
		System.out.println(d);
	}

}
