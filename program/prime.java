import java.util.ArrayList;
import java.util.List;

interface primeInteface
{
	List<Integer> primeList(int[] a);
}
public class prime 
{
	public static void main(String[] args) 
	{
		int[] a = {2,3,4,5,6,7,8,9,12,14,129};
		primeInteface p = new primeInteface() {
			
			List<Integer> primelist = new ArrayList<>();
			@Override
			public List<Integer> primeList(int[] a) 
			{
				for (int i : a)
				{
					if (i ==2 || i == 3) {
				    	primelist.add(i);						
					}
					if(i > 3)
					{
						int s = i/2;
						for(int c = 2; c<=s;c++)
						{
						    if(i % c == 0)
						    {
						    	break;
						    }
						    else {
						    	primelist.add(i);
						    	break;	
							}
						}
					}
				}
				return primelist;
			}
		}; 
		
		System.out.println("prime number : " + p.primeList(a));
	}
}