package Practise;

public class ReverseAWord {
	public static void main(String[] args) {
		String s = "welcome to bangalore and welcome to Test Yantra";	
		String [] sp=s.split(" ");
		for(int i=sp.length-1;i>=0;i--)
		{
			System.out.println(sp[i]+" ");
		}
	}
}
