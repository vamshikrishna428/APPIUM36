package Pattrens;

public class Pattrens5 {

	public static void main(String[] args) {
		int n=5;
		for (int i = 1; i<=n; i++)	//rows
		{
			for (int j = i; j <=n; j++)	//columns
			{
				System.out.print("s ");
			}
			for (int j = 1;j <=i ;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}

														/*
														s s s s s * 
														s s s s * * 
														s s s * * * 
														s s * * * * 
														s * * * * * 
														*/