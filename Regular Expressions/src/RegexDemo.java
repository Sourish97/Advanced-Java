
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Pattern p = Pattern.compile("\\S");
		Matcher m = p.matcher("\t*ab123chABaxYzana3*%&5bccde");
		while(m.find())
			System.out.println(m.start());
	*/
	
		
	/*	//Hexadecimal Number Search
		Pattern p = Pattern.compile("0[xX][a-fA-F0-9]+");
		Matcher m = p.matcher("ABCZ0xX0120xA9ZW0x2A");
		while(m.find())
			System.out.println(m.group());
	*/	
		
	
	/*	//to Search for phone numbers
		Pattern p = Pattern.compile("\\d{3}?[ -\\s]?\\d{4}?");
		Matcher m = p.matcher("000-1234oowNF1234568AKDJF9Y7hnje000 4689wiejfiwe97G");
		while(m.find())
			System.out.println(m.group());	
	*/
		
		//Strings Ending with "WW"
		Pattern p = Pattern.compile("[.]*?XX");
		Matcher m = p.matcher("XYXXZYWXX");
		while(m.find())
			System.out.println(m.group());	
	}

}
