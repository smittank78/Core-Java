package program;

public class numberPresent 
{
	static int available(int[] arr,int find)
	{
		for(int a=0;a<arr.length ; a++)
		{
			if(arr[a] == find)
				return a;
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4,5,6,7,8,9};
		System.out.println("number found at index : " + available(a, 7));
	}
}