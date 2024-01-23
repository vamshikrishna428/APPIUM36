package Practise;

import java.util.LinkedHashSet;

public class OccuranceInAnArray {
	public static void main(String[] args) {
		int [] a= {8,2,3,5,6,7,9,6,3,5,2};
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		for(Integer it:set)
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==it)
				{
					count++;
				}
			}
			System.out.println(it+" =====> "+count);
		}

	}
}
