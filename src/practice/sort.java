package practice;

public class sort {

	static int[] sort(int[] n)
	{
		int[] a = n;
		for(int i=0;i<=a.length -1;i++)
		{
			for(int j=i+1;j<=a.length - 1;j++)
			{
				int temp = 0;
				if(a[j] < a[i])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.print(a[i] + " , ");
		}
		return a;		
	}
	
	public static void main(String[] args) {
		int a[] = {1,5,9,3,6,2,4,7,8,15,0};
		
		System.out.println(a.toString());
		
		for(int i : a)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		sort(a);
	}

}
