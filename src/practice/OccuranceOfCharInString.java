package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OccuranceOfCharInString 
{
	public static void main(String[] args) 
	{
		String s = "my name is smit tank";
		char[] a = s.toCharArray();

		List<Character> characters = new ArrayList<>();
		for(char c : a)
		{
			if(!characters.contains(c) && Character.isAlphabetic(c))
			{
				characters.add(c);
			}
		}
		System.out.println("Dicstincrt chars : " + characters);
		
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();

		for(int i=0;i<a.length;i++)
		{
			if(a[i] != ' ')
			{
			int check = 0;
			try {
			check = map.get(a[i]);
			}
			catch (NullPointerException e) {
				check = 0;
			}
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