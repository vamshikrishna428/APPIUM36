package Practise;

public class FirstMax {

	public static void main(String[] args) {
		int[] a= {20,30,10,50,40};
		int firstmax=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>firstmax)
			{
				firstmax=a[i];
			}
		}
		System.out.println(firstmax);
}
}