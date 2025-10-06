package SignletonPattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BrowserReadResolve {

	public static void main(String[] args) {
		 
		
		try {
			Browser instance1 = Browser.getInstance();
			
			//Serialize the browser instance
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("browser.json"));
			os.writeObject(instance1);
			os.close();
			
			//De-Serialize the browser instance
			ObjectInputStream is = new ObjectInputStream(new FileInputStream("browser.json"));
			Browser instance2 = (Browser) is.readObject();
			is.close();
			
			System.out.println("Hashcode of instance1 "+ instance1.hashCode());
			System.out.println("Hashcode of instance1 "+ instance2.hashCode());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
