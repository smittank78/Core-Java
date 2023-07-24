package KeyWords;

public class loop_if_else 
{
	int a = 10;
	public static void main(String[] args) 
	{
		loop_if_else obj = new loop_if_else();
		System.out.print("for loop : ");
		for (int i = 0;i < obj.a;i++) 
		{
			System.out.print(i + " ");
		}
		int j = 0;
		System.out.println();
		System.out.print("while loop : ");
		while(j < obj.a)
		{
			System.out.print(j + " ");
			j++;
		}
		
	    short k = (short) (obj.a - 10);
		System.out.println();
		System.out.print("do...while loop : ");
		do
		{
			System.out.print(j + " ");
			j--;
		}
		while(j > k);
		
		obj.a = 2;
		while(k <= obj.a)
		{
		if(obj.a == k)
			System.out.println("match : " + k);
			
		else 
			System.out.println("no match at " + k);
		k++;
		}
	}
}