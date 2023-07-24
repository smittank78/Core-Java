package practice.InterviewBit;

import java.util.ArrayList;
import java.util.List;

public class Example2 
{
	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<>();
		for(int i =0;i<=10;i++)
		{
			list.add(i);
		}
		System.out.println(list);
		
		Integer[] array = list.toArray(new Integer[0]);
		
		System.out.println(array.length);
	}
}