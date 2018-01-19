package proxy;

import java.util.Scanner;

public class Ticket {
static String[] s=new String[]{"A","B","C","D","E","F"};
static final int shortp=2;
int price;
String source,destination;
Ticket(String s1,String s2){
	source=s1;
	destination=s2;
}
int getPrice(){
	int d=0,so=0;
	for(int i=0;i<s.length;i++){
		if(s[i].equals(source))
			so=i;
		if(s[i].equals(destination))
			d=i;
	}
	int val=Math.abs(so-d);
	if(val>shortp)
		price=val*5;
		else price=val*3;
	return price;
}
public static void main(String[] args){
	System.out.println("Enter source destination A-F");
	Scanner sc=new Scanner(System.in);
	Ticket t=new Ticket(sc.next(),sc.next());
	System.out.println(t.getPrice());
}
}
