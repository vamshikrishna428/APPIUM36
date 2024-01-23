package Pattrens;
public class Pattren7 {
	public static void main(String[] args) {
										/*
													    * 
													   * * 
													  * * * 
													 * * * * 
													* * * * * 
										 */
		int n=5;
		for (int i = n; i>0; i--)	//rows
		{
			for (int j = 1; j <=n; j++)	//columns
			{
				if(i<=j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");	//only one space 
				}
			}
			System.out.println();
		}
	}
}