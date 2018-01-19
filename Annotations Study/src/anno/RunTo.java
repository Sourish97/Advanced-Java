package anno;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import first.Demo;

public class RunTo {

	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, NoSuchFieldException, SecurityException {
		// TODO Auto-generated method stub
		Class<?> c = first.Demo.class;
		Method a[]=c.getMethods();
		for(Method m:a){
			if(m.getAnnotation(Main.class)!=null)
				{
				
				Demo obj=(Demo)c.newInstance();
				obj.msg=m.getAnnotation(Main.class).value();
				m.invoke(obj);
				}
		}
	}

}
