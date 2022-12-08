package practice;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class reverseList {

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(0);
		list.add(3);
		
		System.out.println( "list : " + list);
		System.out.println("list size : " + (list.size() - 1));
		
		List<Integer> reveList = new LinkedList<>();
		for(int i = list.size() - 1;i >= 0;i--)
		{
			reveList.add(list.get(i));
		}
		System.out.println("reverse list : " + reveList);
		
		Collections.sort(reveList);
		System.out.println("sorted list : " + reveList);
		
	}

}