package practice;

public class factorial 
{
	static int fact(int a)
	{

		System.out.print(a + " ");
		if(a==1)
			return a;
		return a*fact(a-1);
	}
	public static void main(String[] args) 
	{
		int a = 3;
		System.out.println("= " + fact(a));
	}
}