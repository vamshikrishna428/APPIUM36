package Pattrens;

public class FivePattren {

	public static void main(String[] args) {
		{
/*
			int n=4;
			n=(n+1)/2;
			for (int i = 0; i <= n; i++) 
			{
				for(int j=0;j<n-1-i;j++)
				{
					System.out.print(" ");
				}
				int num=1;
				for(int j=0;j<2*i+1;j++)
				{
					System.out.print(""+num);
					if(j<(2*i+1)/2){
						num++;
				}
					else
						num--;
				}
				System.out.println( );
			}
		}
	}
}
*/
			
			
			
/*			 1
		     1 2
		     1 2 3
		     1 2 3 4
		     1 2 3 4 5
			*/
			

			
			int n=5;
			for (int i = 1; i <= n; i++) 
			{
				for(int j=1;j<n;j++)
				{
					System.out.print(" ");
				}
				int num=1;
				for(int j=1;j<=2*i-i;j++)
				{
					System.out.print(" "+num);
					if(j<i){
						num++;
				}
					else
						num--;
				}
				System.out.println( );
			}
		}
	}
}
