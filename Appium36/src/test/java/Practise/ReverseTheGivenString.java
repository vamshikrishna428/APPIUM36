package Practise;

import java.util.*;

public class ReverseTheGivenString {

	public static void main(String[] args) {
		String[] s={"apple","mango","banana","orange"};
		for (int i=0 ; i<s.length; i++){
			
			char[] s2 = s[i].toCharArray();
			int count = 0;
			for(int j=0;j<s2.length;j++) {
			if(s2[j] == 'a'|| s2[j] == 'e'|| s2[j] == 'i' ||s2[j] == 'o' |s2[j] == 'u')
			{
				count++;
			}
		}
		System.out.println(s[i]+" "+count);
	}
}
}
