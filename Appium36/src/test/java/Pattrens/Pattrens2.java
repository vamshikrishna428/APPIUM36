package Pattrens;

public class Pattrens2 {

	public static void main(String[] args) {		
		
/*		* 
		* * 
		* * * 
		* * * * 
		* * * * * 
	*/	
		int n=5;
		for (int i = 1; i<=n; i++) 
		{
			//i=1 ,i<=5 true
			//i=2 ,i<=5 true
			//i=3 ,i<=5 true
			//i=4 ,i<=5 true
			//i=6 ,i<=5 false
			for (int j = 1; j <=i; j++) 
			{
				// j=1 ; j<i true here i=1
				// j=2 ; j<i false here i=1 terminate
				
				// j=1 ; j<i true here i=2	
				// j=2 ; j<i true here i=2
				// j=3 ; j<i false here i=2 terminate
				
				// j=1 ; j<i true here i=3	
				// j=2 ; j<i true here i=3
				// j=3 ; j<i true here i=3 
				// j=4 ; j<i false here i=3 terminate
				
				// j=1 ; j<i true here i=4	
				// j=2 ; j<i true here i=4
				// j=3 ; j<i true here i=4 
				// j=4 ; j<i true here i=4 terminate
				// j=5 ; j<i false here i=4 terminate
				
				System.out.print("* "); // * with space will print
			}
			System.out.println();	// this will go to next line with out printing anything
		}	
	}
}
