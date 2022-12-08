package pattern;

public class Pattern 
{
	public static void main(String[] args) 
	{
		int i,j,k;
		for(i=0;i<6;i++)
		{
			for(j=0;j<6;j++)
			{
				System.out.print("* ");
			}	
			System.out.println();
		}
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println();

		for(i=1;i<6;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print( j + " ");
			}	
			System.out.println();
		}
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println();

		for(i=5;i>0;i--)
		{
			for(j=i;j> 0;j--)
			{
				System.out.print( j + " ");
			}	
			System.out.println();
		}
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println();

		for(i=5;i>=0;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------");
	
		System.out.println();

		for(i=5;i>0;i--)
		{
			for(k=0;k<5-i;k++)
			{
				    System.out.print("  ");
			}
			for(j=i;j> 0;j--)
			{
				System.out.print( "*" + " ");
			}	
			System.out.println();
	
		}
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println();

		for(i=1;i<6;i++)
		{
			for(k=5;k>i;k--)
			{
				    System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print( "*" + " ");
			}	
			System.out.println();
	
		}
		
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println();


		for(i=5;i>0;i--)
		{
			for(k=0;k<5-i;k++)
			{
				    System.out.print(" ");
			}
			for(j=i;j>=1;j--)
			{
				System.out.print( "*" + " ");
			}	
			System.out.println();
	
		}
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println();
		
		char c = 'A' ;
		// 65 = A  , 97 = a
		while(c < 'Z' )
		{
			c++;
			System.out.print(c);
		}
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println();
		int cc = 65;
		
		for(i = 0;i<=5;i++)
		{
			for(k = 5;k >=i;k--)
			{
				System.out.print(" ");
			}
			for(j = 0;j<=i;j++)
			{
				System.out.print((char)(cc + j) + " ");
			}
			System.out.println();
		}
				
		
		
}
}