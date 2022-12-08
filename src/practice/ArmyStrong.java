package practice;

public class ArmyStrong 
{
	public static void main(String[] args) 
	{
		int i = 153;
		int a = i;
		int m,sum =0,divide;
		boolean flag = true;
		while(flag)
		{
		if(i==0)
		{
			flag = false;
		}
		else
		{
		m = i%10;
		System.out.println("m : " + m);
		sum = sum + (m*m*m);
		System.out.println("sum : " + sum);
		divide = i / 10;
		i = divide;
		}
		
		}
		System.out.println(a + " == " + sum);
		if(sum == a)
			System.out.println("arm strong");
		else
			System.out.println("not arm strong");

	}
}