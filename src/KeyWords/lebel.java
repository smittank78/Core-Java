package KeyWords;

public class lebel 
{
	public static void main(String[] args) 
	{
		System.out.println("break : ");
		System.out.println();
		first :
			for(int i = 0;i<=10 ; i++)
			{
				second :
					for(int j = 0; j<= 3 ; j++)
					{
						System.out.print((i+j) + "  ");
					}
				System.out.println();
				if(i==3)
					break  first;
			}
		System.out.println();
		System.out.println("Continue : ");
		first :
			for(int i = 0;i<=10 ; i++)
			{
				second :
					for(int j = 0; j<= 3 ; j++)
					{
						if(i == 5 )
							continue first;
						else
							System.out.print((i+j) + "  ");
						if(i==7)
							break  first;
					}
				System.out.println();
				if(i==3)
					break  first;
			}
	}
}