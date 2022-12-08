package practice;

import java.util.Scanner;

public class fibonacci 
{
	public static int fibonacciRecursive(int n) {
		if (n <= 1)
			return n;
		return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	}
	static void fibonaci(int num)
	{
		int a=0;
		int b=1;
		int c=1;
		
		for(int i = 1;i<=num ; i++)
		{
			System.out.print(a + " ");
			a = b;
			b = c;
			c = a + b;
		}
	}
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter num : ");
		int a = scanner.nextInt();

		fibonaci(a);
		System.out.println();
		System.out.println("recursive : " + fibonacciRecursive(a));
		
	}
}