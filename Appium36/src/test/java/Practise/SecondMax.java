package Practise;

public class SecondMax {

	public static void main(String[] args) {
		int[] a= {4, 7,5,6,8,11};
		int firstmax=a[0];

		int secondmax=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(firstmax<a[i])
			{
				
				secondmax=firstmax;
				firstmax=a[i];
			}
			else if(secondmax<a[i]) {
				secondmax=a[i];
		}
	}
		System.out.println(firstmax+"==========>"+secondmax);

}
}




