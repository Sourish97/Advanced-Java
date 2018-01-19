import java.util.Scanner;

public class Computer {
int ram,rom;
String processor;
double clkspd;

Computer(){	
}

Computer(int x,int y,String proc,double clk){
	ram=x;
	rom=y;
	processor=proc;
	clkspd=clk;
}
public String toString(){
	return ram+" GB\t"+rom+" GB\t"+processor+"\t"+clkspd+" Ghz";
	
}
 static Computer getInstance(String s1){
	 if(s1.equals("Pc"))
			return new Pc(4,500,"i3",2.3,"Nvidia","Windows");
		else if(s1.equals("Server"))
		return new Server(8,1000,"i5",2.5,20,"Tomcat");
		else
			return null;
 }

}

class Pc extends Computer
{
	String graphiccard;
	String os;
	Pc(){
		
	}
	Pc(int x,int y,String proc,double clk,String s1,String s2){
		super(x,y,proc,clk);
		graphiccard=s1;
		os=s2;
	}
	
	public String toString(){
	return super.toString()+"\t"+graphiccard+"\t"+os;
	}

}

class Server extends Computer
{
	int servid;
	String webServer;
	Server(){
	}
	
	Server(int x,int y,String proc,double clk,int sid,String webs){
		super(x,y,proc,clk);
		servid=sid;
		webServer=webs;
	}
	
	public String toString(){
		return super.toString()+"\t"+servid+"\t"+webServer;	
				}
	
}
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Computer c=null;
		System.out.println("Enter type of computer");
		String s1=sc.next();
		c=Computer.getInstance(s1);		
		System.out.println(c);
	}
}