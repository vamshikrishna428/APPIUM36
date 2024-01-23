package Practise;

import java.util.LinkedHashSet;

public class UniqueShouldPrint {

	public static void main(String[] args) {
		String s1="my name is raj";
		String s2="my name is prakashraj";
		String s=s1+" "+s2;
		System.out.println(s);
		String [] sp=s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0;i<sp.length;i++)
		{
			set.add(sp[i]);
		}
		for(String word:set)
		{
			int count=0;
			for(int i=0;i<sp.length;i++)
			{
				
				if(word.equals(sp[i]))
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(word);
			}
		}
	}
}
