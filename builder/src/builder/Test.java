package builder;
class Computer
{
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
	
	static class Builder
	{
		Computer c;
		Builder(){
		c=new Computer();
		}
		Builder set(String n, int r,int h)
		{
			c.name=n;
			c.ram=r;
			c.hd=h;
			return this;
		}
		
		Builder set(String server,boolean s)
		{
			if(s)
			{
				c.sname=server;
				c.webServer=s;
			}
			return this;
		}
		
		Computer create(){
			return c;
		}
	}
	
	public String toString(){
		return sname+"\t"+name+"\t"+hd+"\t"+ram+"\t"+webServer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c=new Computer.Builder().set("Tomcat", true).set("Apple", 4, 100).create();
		System.out.println(c);
	}

}
