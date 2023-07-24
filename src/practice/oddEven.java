package practice;

import java.util.Scanner;

public class oddEven 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter num : ");
		int a = scanner.nextInt();
		
		if(a % 2 == 0)
			System.out.println("even number");
		else 
			System.out.println("odd number");
	}
}