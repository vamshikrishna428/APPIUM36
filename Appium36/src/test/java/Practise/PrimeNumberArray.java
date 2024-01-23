package Practise;

public class PrimeNumberArray {
public static void main(String[] args) {
	int b[] = {2,3,5,7,9,11,22,16,8,5};
	for(int i=0; i< b.length; i++) {
		int n=b[i];
		int j=2;
		while(true) {
			if(n%j==0)
			{
				break;
			}
			else
			{
				j++;
			}
		}
		if(j==n) {
			System.out.println(b[i]+" ");
		}
	}
}
}
