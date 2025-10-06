package SignletonPattern;

import java.io.Serializable;

public class Browser implements Serializable, Cloneable {

	//1. private static instance of class
	private volatile static Browser browser;
	
	//2. private constructor to prevent instantiation of object
	private Browser() {
		if(browser!=null) {
			throw new IllegalArgumentException("Object already exists");
		}
	}
	
	//3. public static getInstance method to access to the instance object
	public static Browser getInstance() {
		if(browser == null) {
			synchronized (Browser.class) {
				if(browser == null) {
					browser = new Browser();
				}
			}
		}
		return browser;
	}
	
	//4. individual public method of the class
	public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
	
	//Add readResolve() - which will be called during de-serialization process, this will return class instance
	protected Object readResolve() {
		return getInstance();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Signleton method cannot be cloned");
	}
}
