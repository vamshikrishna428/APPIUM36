package Practise;

import java.util.LinkedHashSet;

public class RemoveDuplicateChar {

	public static void main(String[] args) 
	{
		
		String s = "welcome to bangalore";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		String str1 = s.replace(" ", "");
		String str2 = str1.toLowerCase();
		
		for(int i=0;i<str2.length();i++)
		{
			set.add(str2.charAt(i));
		}
		System.out.println(set);
	}

}
