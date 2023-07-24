package practice;

import java.util.Arrays;

public class findDuplocatesFromArray {

	public static void main(String[] args) {

		int[] arr1 = new int[] { 1, 2, 3, 4, 5, 6 };
		int[] arr2 = new int[] { 1, 2, 7, 8 };
		int[] finalarray = Arrays.copyOf(arr1, arr1.length + arr2.length);
		System.arraycopy(arr1, 0, finalarray, 0, arr1.length);
		System.arraycopy(arr2, 0, finalarray, arr1.length, arr2.length);

		int[] arr3 = new int[arr1.length + arr2.length];
		int index = 0;
		for (int i = 0; i < finalarray.length; i++) {
			int count = 0;
			for (int j1 = 0; j1 < arr1.length; j1++) {
				if(count > 1)
					break;
				if(finalarray[i] == arr1[j1])
					count++;
			}	
			
			for (int j2 = 0; j2 < arr2.length; j2++) {
				if(count > 1)
					break;
				if(finalarray[i] == arr2[j2])
					count++;
			}	

			for (int k= 0; k <= index; k++) {
				if(finalarray[i] == arr3[k])
					count = 0;
			}
			
			
			if(count > 1) {
				arr3[index] = finalarray[i];
				index++;
			}
		}
		
		for (int k= 0; k < index; k++) {
			System.out.print(arr3[k] + " ");
		}
	}

}
