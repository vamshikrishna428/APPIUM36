package Pattrens;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		int a[]=new int[]{1,2,3,4,5}; 
		int b[]=new int[] {5,6,7,8,9,11};
		
		for (int i = 0; i < a.length; i++)
		{
		int result = a[i]+b[i];
		System.out.println(result);
	}

}
}

