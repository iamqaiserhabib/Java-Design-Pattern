package SignletonPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BrowserTest {

	public static void main(String[] args) {
		Browser instance1 = Browser.getInstance();
		Browser instance2 = null;
		
		try {
			
			Constructor<Browser> constructor = Browser.class.getDeclaredConstructor();
			
			constructor.setAccessible(true);
			instance2 = constructor.newInstance();
			
			System.out.println("Hashcode of instance1 "+ instance1.hashCode());
			System.out.println("Hashcode of instance1 "+ instance2.hashCode());
			
			
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
