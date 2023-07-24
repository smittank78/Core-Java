package practice.InterviewBit;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Implement a function that takes a list of integers 
 * returns the largest product that can be obtained by multiplying any three integers. 
 * The list may contain both positive and negative numbers
 */
public class FiveYear {

	public static void main(String[] args) {
		int[] numbers = new int[] {1,4,2,6,3,8,0,-1,7,-9};
		List<Integer> list = Arrays.asList(1,4,2,6,3,8,0,-1,7,-9);
		System.out.println("largest product by smit " + myfun(list));
		System.out.println("largest product by bard " + largestProductOfThree(numbers));
		System.out.println("largest product by hard work " + largest(numbers));
	}

	static int myfun(List<Integer> list) 
	{
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list);

		if(list.size() < 2)
			return 0;
		else {
			return list.get(0) * list.get(1) * list.get(2);
		}
	}
	public static int largestProductOfThree(int[] numbers) {
        int maxProduct = Integer.MIN_VALUE;
        for(int i = 0;i < numbers.length - 2 ;i++)
        {
        	for(int j = i+1;j < numbers.length - 1 ;j++)
            {
        		for(int k = j+1;k < numbers.length;k++)
                {
                	int product = numbers[i] * numbers[j] * numbers[k];
                	if(product > maxProduct)
                		maxProduct = product;
                }	
            }	
        }
        return maxProduct;
    }
	
	public static int largest(int[] numbers) {
		if(numbers.length > 3) {
        int[] arr = new int[numbers.length];
        for(int i = 0;i < numbers.length - 1 ;i++)
        {
        	for(int j = i+1;j < numbers.length - 1 ;j++)
            {
        		if(numbers[j] > numbers[i])
        		{
        			int a = numbers[j];
        			numbers[j] = numbers[i];
        			numbers[i] = a;
        		}
            }	
        }
        return numbers[0] * numbers[1] * numbers[2];
    	}
		return 0;
	}
	
	
}