package Practise;

import java.util.HashSet;

public class CountVowelsRemoveDuplicates {

	public static void main(String[] args) {
		String s = "indiaae";
		HashSet<Character> set=new HashSet<Character>();
		for(int i=0; i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		int count=0;
		for(Character ch:set)
		{
			if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u') 
			{
				count++;
			}
		}
		System.out.println(set+" "+count);
	}

}
