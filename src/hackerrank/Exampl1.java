package hackerrank;

import java.util.Scanner;

/*
 * 
In this problem, you are given n integers. You need to find the maximum number of unique integers among all the possible contiguous sub-arrays of size m.

Input Format

The first line of input contains two integers n  and m : representing the total number of integers and the size of the sub-array, respectively.
The next line contains space separated integers.

Output Format

Print the maximum number of unique integers among all possible contiguous sequencial subarrays of size.

Sample Input

10 3
1 2 9 9 9 5 7 9 1 1

Sample Output : 

3

Explanation

In the sample test-case, there are 4 sub-arrays of contiguous numbers.

 - (1 2 9) Has 3 unique numbers.

 - (2 9 9) Has 2 unique numbers.

 - (9 9 9) Has 1 unique numbers.

 - (9 9 5) Has 2 unique numbers.

 - (9 5 7) Has 3 unique numbers.

 - (5 7 9) Has 3 unique numbers.

 - (7 9 1) Has 3 unique numbers.

 - (9 1 1) Has 2 unique numbers.


*******next task : hard++***********
* integer size : 16
* array size : 7
* super array = {1 25 36 986 36 2 1 59 63 2 0 1 8 99 63 1}
* like sub array is like : {1 25 36 986 36 2}
*  then convert in single digits like 25 convert into 2 5 
*  if number has 3 digit then remove from array
*  if last index having 2 digit number then add 0 in between index
*  ,remove last element because subarray is 7  and add in saperate
*  now sub array is {1 2 5 36 989 36 2}
*  convert 36 into single digit
*  now sub array is {1 2 5 3 6 989 36}
*  989 so remove it
*  now sub array is {1 2 5 3 6 36}
*  convert 36 into single digit
*  now sub array is {1 2 5 3 6 3 6}
*  
*  now find unique digits
*  
*  repeat until ...
 */
public class Exampl1 
{
	public static void main(String[] args) 
	{		
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter TOTAL_NUMBER_OF_INTEGERS : ");
		int TOTAL_NUMBER_OF_INTEGERS = scanner.nextInt();
		System.out.print("\nenter TOTAL_NUMBER_OF_SUBARRAYS : ");
		int TOTAL_NUMBER_OF_SUBARRAYS = scanner.nextInt();
		System.out.println();
		int[] array = new int[TOTAL_NUMBER_OF_INTEGERS];
		int[] maxfind = new int[TOTAL_NUMBER_OF_SUBARRAYS];
	
		for(int i=0;i<TOTAL_NUMBER_OF_INTEGERS;i++)
		{
			System.out.print("enter " + (i+1) + " number : ");
			int a = scanner.nextInt();
			array[i] = a;
		}
		long statr_time = System.currentTimeMillis();
		int[] subArray;
		int start = 0;
		boolean flag = true;
		
		while(flag) 
		{
			subArray = new int[TOTAL_NUMBER_OF_SUBARRAYS];
			for(int i=0;i<TOTAL_NUMBER_OF_SUBARRAYS;i++)
			{
				subArray[i] = array[start + i];
			}
			
			if(start == (TOTAL_NUMBER_OF_INTEGERS - TOTAL_NUMBER_OF_SUBARRAYS))
				flag = false;
	
			int uniqueCount = new Integer(0);
			for(int i=0;i<subArray.length;i++)
			{
				boolean eligible = true;
				for(int k=0;k<i;k++)
				{
					if(subArray[k] == subArray[i])
					{
						eligible = false;
						break;
					}
				}
				if(eligible)
				{
				   uniqueCount++;
				}
			}
			if(start < maxfind.length)
			{
				maxfind[start] = uniqueCount;
			}
			System.out.print("( ");
			for(int i : subArray)
			{
				System.out.print(i +  " ");
			}			
			System.out.println(") has " + uniqueCount + " unique number");
			start++;
		}		
		int max = 0;
		for(int u=0;u<maxfind.length;u++)
		{
			if(max < maxfind[u])
				max = maxfind[u];
		}
		System.out.println("Max count is : " + max);
	}
}