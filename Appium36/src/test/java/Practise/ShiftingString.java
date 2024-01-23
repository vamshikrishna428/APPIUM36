package Practise;

public class ShiftingString {

	public static void main(String[] args) {
		String s = "welcome to bangalore ";	
		String [] a=s.split(" ");
		int key=2;
		for(int k=0;k<key;k++)
		{
			String temp=a[0];
			for(int i=1;i<a.length;i++)
			{
				a[i-1]=a[i];
			}
			a[a.length-1]=temp;
		}
		for(String str:a)
		{
			System.out.println(str+" ");	
		}
	}

}
