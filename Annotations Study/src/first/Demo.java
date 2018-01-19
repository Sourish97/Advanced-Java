package first;
import anno.Main;

public class Demo {
	public String msg;
	@Main(value="Bye")
	public void get(){
		System.out.println(msg+"to All");
	}
}
