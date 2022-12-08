package practice;

import java.util.Arrays;

public class binarySearch 
{
	
	int search(int a[],int low,int high,int num)
	{
		
		if(low < high)
		{
			int mid = low + high / 2;
			System.out.println("mid : " + mid);
			 if(a[mid] == num)
				{
					return mid;
				}
		
		else if(a[mid] > num)
		{
			return search(a, low, mid - 1, num);
		}
		else if(a[mid] < num)
		{
			return search(a, mid+1, high, num);
		}
		}
		if(low >high)
			return -1;
		
		return 404;
	}
	
	public static void main(String[] args) 
	{
		binarySearch search = new binarySearch();
		int[] a = {1,2,3,9,7,55,42,15,5,0,5};
		Arrays.sort(a);
		System.out.println("......." + a.length);
		System.out.println("num at index : " + search.search(a,0,a.length-1,5));
		
		for(int i = 0;i<=a.length - 1;i++)
		{
			if(a[i] == 5)
			{
				System.out.println("index : " + i);
				break;
			}
			System.out.print(a[i] + " ");
		}
		
	}
}