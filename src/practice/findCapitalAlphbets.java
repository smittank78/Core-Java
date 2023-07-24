package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class findCapitalAlphbets {

	public static void main(String[] args) {
		
		String str = "My name is Smit";
		
		int count = 0;

		char[] charArray = str.toCharArray();

		for (char c : charArray) {

			if(Character.isUpperCase(c))
				count++;
		}
		System.out.println(count);
		Map<String , String> map = new HashMap<>();
		Set<String> keySet = map.keySet();
		//add map -> add stauds and find cgpa>8 using streams

		count = 0;
		int[] arr = new int[]{1,3,4,6,7};
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != -1)
			{
				for (int j = i+1; j < arr.length; j++) 
				{
					if(arr[i] + arr[j] == 7)
					{
						arr[j] = -1;
						count++;
						break;
					}
				}
			}
		}
		System.out.println(count);
	}	
}