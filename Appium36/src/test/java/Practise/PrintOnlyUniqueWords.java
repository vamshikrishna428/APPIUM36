package Practise;

import java.util.LinkedHashSet;

public class PrintOnlyUniqueWords {
	public static void main(String[] args)
	{
		String s = "welcome to bangalore and welcome to Test Yantra";	
		
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
			if(count>0)
			{
				System.out.println(word+" "+count);
			}
		}
	}
}


