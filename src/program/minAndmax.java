package program;

public class minAndmax 
{
	public static void main(String[] args) 
	{
		int[] a = {-20,1,6,5,0,1,2,-10,7,8,2,11,5,-5};
		int max = a[0];
		int min = a[0];
		int i,j;
		for(i=0;i< a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				System.out.print(a[i] + " & " + a[j] + " | ");
				
				if(a[i]<a[j])
				{
					max = a[j];
					System.out.print("max -> " + max);
					i = j-1;
					break;
				}
			}
			System.out.println();
			System.out.println("------------------------");
		}
		System.out.println("max : " + max);
		
		for(i=0;i<=a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				System.out.print(a[i] + " & " + a[j] + " | ");
				
				if(a[i]>a[j])
				{
					min = a[j];
					System.out.print("min -> " + min);
					i = j-1;
					break;
				}
				
			}
			System.out.println();
			System.out.println("------------------------");
			if(j == a.length)
				//i = j;
				break;			
		}
		System.out.println("min : " + min);
	}
}