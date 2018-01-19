import java.io.*;
import java.util.regex.*;
public class FileRegex {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileReader f=new FileReader("/root/Documents/4547/advancedJava/src/day3/ReflectionApi1.java");
BufferedReader b=new BufferedReader(f);
int ch;
StringBuffer s;
while((ch=b.read())!=-1)
{
	s=new StringBuffer((char)ch+b.readLine());
	Pattern p = Pattern.compile("class\\s[\\w]+[{[\\d\\D]*}]+?");
	Matcher m = p.matcher(s);
	while(m.find())
		System.out.println(m.group());
}

b.close();
	}

}
