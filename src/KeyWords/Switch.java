package KeyWords;

import java.util.Scanner;

public class Switch 
{
	public static void main(String[] args) 
	{
		int j;
		System.out.print("enter case : ");
		Scanner sc = new Scanner(System.in);
		j = sc.nextInt();
		if(j > 3)
			System.out.println("case number out of range ");
		else
			switch (j) {
			case 0: {
				System.out.println("a");
				break;
			}
			case 1: {
				System.out.println("b");
				break;
			}
			case 2: {
				System.out.println("c");
				break;
			}
			case 3: {
				System.out.println("d");
				break;
			}
			default:
					System.out.println("case not found");
			}
	}
}