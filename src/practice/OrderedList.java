package practice;

import java.util.concurrent.CopyOnWriteArrayList;

/*
 * find middle element
 */
public class OrderedList 
{
	public static void main(String[] args) 
	{
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList();
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(7);
		list.add(7);
		
		int size = list.size();
		System.out.println("size : " + size);
		int i;
		if(size%2==0)
		{
			i = size/2;
			System.out.println("i : " + i);
			System.out.println("size even : " + list.get(i) + " and " + list.get(i+1));
		}

		else
		{
			i = size/2;
			System.out.println("i : " + i);
			System.out.println("odd : " + list.get(i));
		}

		System.out.println(list.size());
		for(Integer j : list)
		{
			list.add(j);
		}
		System.out.println(list.size());
	}
}