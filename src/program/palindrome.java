package program;

import java.util.ArrayList;
import java.util.List;

class palindrome
{
	static int pelindromeNumber(int a)
	{
			int p = 0;
			while(a>0)
			{
			int s = a % 10;
			p = (p * 10) + s;  // p = (p * 10) + (a % 10);
			a = a/10;
			}
			return p;
	}
	public static void main(String[] args) 
	{
		int a[] = {12,22,345,343,678,111};
		
		List<Integer> pelindromeList = new ArrayList<>(); 
		
		int k =0;
		for (int i : a) 
		{
			k = pelindromeNumber(i);
			if(i == k)
			{
				pelindromeList.add(i);
			}
		}
		System.out.print("pelindrome : " + pelindromeList);
		
	}
}