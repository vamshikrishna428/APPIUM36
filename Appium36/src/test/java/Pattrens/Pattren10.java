package Pattrens;

public class Pattren10 {
	public static void main(String[] args) {
											/*		
													0 
													2 4 
													6 8 10 
													12 14 16 18 
													20 22 24 26 28 
												*/	
		int n=3;
		int p=0;
		for (int i = 1; i <=n; i++)
		{
		for (int j=1 ; j<=i; j++) 
		{
		System.out.print(p+" ");
		p+=2;
		}	
		System.out.println();
	}

	}
}
