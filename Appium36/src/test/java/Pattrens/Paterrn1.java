package Pattrens;

public class Paterrn1 {

	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<n;i++) {
			for (int j = 1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				if(j%2==1)
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}