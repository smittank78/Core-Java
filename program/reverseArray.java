interface reverse
{
	int[] reverseArray(int a[]);
}
public class reverseArray 
{
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,6,7,8,9};
		
		reverse r = (int i[])->{
			int count =0;
			int b[] = new int[i.length];
			
			for(int j=i.length-1;j>=0;j--)
			{
				b[j] = i[count];
				count++;
			}
			return b;
		};
		
		int rev[] = r.reverseArray(a);
		for (int i : rev) {
			System.out.print(i + " ");
		}
	}
}