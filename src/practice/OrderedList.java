package practice;

import java.util.ArrayList;
import java.util.List;

public class OrderedList 
{
	public static void main(String[] args) 
	{
		List list = new ArrayList();
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(7);
		list.add(7);
		
		int size = list.size();
		float ans,i;
		if(size%2==0)
		{
			i = size/2;
			ans = ((int)list.get((int) (i-1)) + (int)list.get((int) i)) / 2f;
			System.out.println("even : " + ans);
		}

		else
		{
			i = size/2;
			ans = (int) list.get((int) (i-1));
			System.out.println("odd : " + ans);
		}
	
	}
}