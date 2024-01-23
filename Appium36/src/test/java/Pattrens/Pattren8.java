package Pattrens;

public class Pattren8 {

	public static void main(String[] args) {
															/*		
																	* * * * * 
																	 * * * * 
																	  * * * 
																	   * * 
																	    * 
															*/
		int n=5;
		for (int i = n; i>0; i--)	//rows
		{
			for (int j = n; j>0; j--)	//columns
			{
				if(i>=j)
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

