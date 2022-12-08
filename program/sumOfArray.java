interface array
{
	int add(int[] n);
}
public class sumOfArray 
{
	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		for(int i : a)
		{
			sum += i;
		}
		System.out.println("sum by forEach : " + sum);
		 
		array num = (int[] n)->
				{
					int s =0;
					for(int i : n)
					{
						s += i;
					}
					return s;
				};
		System.out.println("sum by lambda : " +  num.add(a));
		
		//anonymous 
		array m = new array() {
			
			@Override
			public int add(int[] n) {
				{
					int s =0;
					for(int i : n)
					{
						s += i;
					}
					return s;
			}
		}}; 
		System.out.println("sum by anonymous  : " +  m.add(a));
		
	}
}