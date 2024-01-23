package Pattrens;

public class FivePattrens1 {
	public static void main(String[] args) {
		
/*		* * * * * 
		* * * * * 
		* * * * * 
		* * * * * 
		* * * * * 	*/
		int n=5;
		for (int i = 1; i <=n; i++) {
			//i=1 ,i<=5 true 
			for (int j = 1; j <=n; j++) {
				// j<1 ; j<5 true
				// j<2 ; j<5 true
				// j<3 ; j<5 true
				// j<4 ; j<5 true
				// j<5 ; j<5 true
				// j<6 ; j<5 false terminate
				System.out.print("* ");	// * with space will print 
			}
			System.out.println();	// this will go to next line with out printing anything
		}
	}
}
