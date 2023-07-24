package program;

public class findString 
{
	public static void main(String[] args) 
	{	
		String aString = "smit";
		int a = aString.indexOf("abc");
		if(a == -1)
			System.out.println("not present");
		else
			System.out.println("present at index : " + a);
	}
}