package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OccuranceOfStringInList {
	
	static int i = 0;
	
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		
		names.add("smit");
		names.add("mit");
		names.add("smit");
		names.add("it");
		names.add("smit");
		names.add("amit");
		
		Map<String,Integer> map = new HashMap<String, Integer>();
		
		names.forEach(n->{
			if(map.get(n) == null)
			{
			names.forEach(name -> {
				if(name ==n)
				{
					i++;
				}
			});
			map.put(n,i);
			i=0;
			}
		});
		System.out.println(map);
		
		for (String s : map.keySet()) {
			System.out.println(s + " : " + map.get(s));
		}
	}
	
}
