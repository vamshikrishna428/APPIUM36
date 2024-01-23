package Practise;

import java.util.TreeSet;

public class ThreeMovieDuration {
	public static void main(String[] args) {
		String s1="moviename time duration 2:10 three times ";
		String s2="moviename time duration 2:40 three times ";
		String s3="moviename time duration 2:30 three times ";
		
		String []s= {s1,s2,s3};
		TreeSet<String> set=new TreeSet<String>();
		for(int i=0;i<s.length;i++)
		{
			String str[]=s[i].split(" ");
			
			set.add(str[str.length-3]);
		}
		System.out.println(set);
		for(String duration:set)
		{
			for(int i=0;i<s.length;i++)
			{
				if(s[i].contains(duration))
				{
					System.out.println(s[i]);
				}
			}
			break;
		}
		
	}
	}
