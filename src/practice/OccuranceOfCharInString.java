package practice;

import java.util.HashMap;

public class OccuranceOfCharInString 
{
	public static void main(String[] args) 
	{
		String s = "my name is smit jigneshkumar patel";
		char[] a = s.toCharArray();

		HashMap<Character,Integer> map = new HashMap<Character,Integer>();

		for(int i=0;i<a.length;i++)
		{
			if(a[i] != ' ')
			{
			int check = 0;
			check = map.get(a[i]);
			
			if( check == 0)
			{
			int c =1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i] == a[j])
				{
					c++;
				}		
			}
			map.put(a[i],c);
			}
			}
		}
		for (Character k : map.keySet()) 
		{
			System.out.println(k + " - " + map.get(k));
		}
	}
}