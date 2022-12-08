import java.util.Scanner;

public class factorial 
{
	static int factRecursive(int num)
	{
		if(num == 1)
			return 1;
		return num * factRecursive(num - 1);
	}
	static int fact(int num)
	{
		int f = 1;
		for(int i = 1;i<=num;i++)
		{
			f = f * i;
		}
		return f;
	}
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter num : ");
		int a = scanner.nextInt();
		System.out.println();
		System.out.println("factorial Recursive : " + factRecursive(a));
		System.out.println("factorial : " + fact(a));		
		
	}
}