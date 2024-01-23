package Pattrens;

public class LengthOfEachWord {

	public static void main(String[] args) {
		String s = "learn Java java Selenium selenium";
		s=s.toLowerCase();
		int count;
		String[] words = s.split(" ");
		System.out.println(s);
		for(int i=0; i<words.length;i++)
		{
			System.out.print(words[i].length()+" ");
		}
	}

}
