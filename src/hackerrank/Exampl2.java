package hackerrank;

import java.util.Scanner;

/*
 * Operation :

UPDATE x y z W --> change (x,y,z) cell with W
QUERY x1 y1 z1 x2 y2 z2 --> sum values of all cells between (x1,y1,z1) and (x2,y2,z2)


Input :  p q where p = p x p x p and q = number of operation performing on this matrics   

4 5
UPDATE 2 2 2 4
QUERY 1 1 1 3 3 3
UPDATE 1 1 1 23
QUERY 2 2 2 4 4 4
QUERY 1 1 1 3 3 3

Output :

4
4
27

Description :

there is a cube of 4 * 4 * 4 and there are 5 queries.
Initially all the cells (1,1,1) to (4,4,4) are 0.
UPDATE 2 2 2 4 mazes the cell (2,2,2) = 4
QUERY 1 1 1 3 3 3. sum of cell value where cordinate between (1,1,1) and (3,3,3). The answer to this query is 4.
UPDATE 1 1 1 23. updates the cell (1,1,1) to 23. 
QUERY 2 2 2 4 4 4. sum of cell value where cordinate between (2,2,2) and (4,4,4). So, the answer is 4.
QUERY 1 1 1 3 3 3. sum of cell value where cordinate between (2,2,2) and (4,4,4). So, the answer is 27.
 */
public class Exampl2 
{
	public static void main(String[] args) 
	{		
			Scanner sc = new Scanner(System.in);
			System.out.print("enter matric size : ");
			int size = sc.nextInt();
			System.out.print("enter number of operation : ");
			int operation = sc.nextInt();
			int[][][] matrics = null;
			matrics = new int[size][size][size];	
			
			for(int x=0;x<size;x++)
			{
				for(int y=0;y<size;y++)
				{
					for(int z=0;z<size;z++)
					{					
						matrics[x][y][z] = 0;
					}
				}
			}	
			
			for(int op =0; op<operation;operation++)
			{
				System.out.print("enter equery : ");
				String Query = sc.next();
				if(Query.contains("update "))
				{
					String substring = Query.substring(6);
					char[] charArray = substring.toCharArray();
					int[] change = new int[substring.length()/2];
					int index = 0;
					for (int i = 0; i <change.length; i++) {
						if(i%2==0)
						{
							change[index] = Integer.parseInt(String.valueOf(charArray[i]));
						}
					}
					matrics[change[0]][change[1]][change[2]] = change[3];
				}
				if(Query.contains("query "))
				{
					
				}
				System.out.println();
			}
	}
	public void query() {
		
	}
}