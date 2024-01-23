package Pattrens;

public class Pattrens3 {

	public static void main(String[] args) {
														/*
														 * * * * * * 
														 * * * * 
														 * * * 
														 * * 
														 * 
														 
														 */
		
		int n=5;
		for (int i = 1; i <=n; i++) //rows
		{
			//i=1 ,i<=5 true
			//i=2 ,i<=5 true
			//i=3 ,i<=5 true
			//i=4 ,i<=5 true
			//i=6 ,i<=5 false terminate
		
			for (int j = i; j <=n; j++)	//columns
			{
				//j=5 ,5<=5 true
				//j=6 ,6<=5 false terminate
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}
}

