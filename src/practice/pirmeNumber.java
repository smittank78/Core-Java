package practice;

import java.util.Iterator;
import java.util.Scanner;

public class pirmeNumber 
{
	private static boolean primeNumber(int a) 
	{
		boolean flag = true;
/*		if(a == 0 || a == 1)
			flag = false;
*/		if(a == 2)
			flag = true;
		if(a > 2)
		{
			for(int i=2;i<= a/2;i++) 
			{
				if(a % i == 0)
					flag = false;
			}
		}
		return flag;
	}
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter num : ");
		int a = scanner.nextInt();
		
		System.out.println("prime number : " + primeNumber(a));
		
	}
}