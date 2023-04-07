package sealedclass;

public class RecordClassJdk16 
{
	/*
	 * record is a dto class which is immutable.
	 * 
	 * private final String name,processor;
	 * default parameterized constructor
	 * provides toString,hash-code,equals,getters method
	 * write n number of methods inside the body
	 * write static variable
	 * instance variable not allowed
	 */
	record Laptop(String name,String processor) {}
	
	public static void main(String[] args) 
	{
		Laptop lenovo = new Laptop("lenovo", "i5");
		System.out.println(lenovo.name);
		System.out.println(lenovo.processor);

		Laptop lenovo1 = new Laptop("lenovo", "i5");
		System.out.println(lenovo.equals(lenovo1));
		
		Laptop lenovo2 = new Laptop("lenovo", "i3");
		System.out.println(lenovo.equals(lenovo2));
		/*
		 * you can't modify value.
		 * lenovo.name = "hp";
		 */		
	}
}