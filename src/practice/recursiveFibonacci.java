package practice;

import java.util.Scanner;

public class recursiveFibonacci 
{
	static int a0=0,a1=1,a2;
	static void fibonacci(int num)
	{
		if(a0 == 0)
			System.out.print(a0 + " " + a1 + " ");		
		a2 = a0 + a1;
		a0 = a1;
		a1 = a2;
		System.out.print(a2 + " ");
		if(num > 0)
			fibonacci(num-1);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("");
		Scanner scanner = new Scanner(System.in);
		System.out.print("num : ");
		int a = scanner.nextInt();
		
		fibonacci(a);
	}
}