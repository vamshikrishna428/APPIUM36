package Practise;

public class MissingNumbers {


	public static void main(String[] args) {
		int a[]= {2,3,5,7,8,11,15};
		for (int i = 0; i < a.length-1; i++) 
		{
			int n=a[i+1]-a[i];	
			int count=1;
			while (n>1) 
			{
				System.out.print(a[i]+count+" ");
				count++;
				n--;
			}
		}
	}
}
