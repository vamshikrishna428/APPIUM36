package Practise;

import java.util.StringTokenizer;

public class Practise3 {
	public static void main(String a[]){
		String s = " welcome to tyss and hi everyone";
		String delims = " ";
		StringTokenizer st = new StringTokenizer(s, delims);
		System.out.println("No of Token = " + st.countTokens());
		while (st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}

	}	

	/*	public static void main(String[] args) {
		System.out.println(10+20+"hi"+10);
		System.out.println("hi"+10+20);
	}
	 */
}
