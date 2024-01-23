package Practise;

import java.util.LinkedList;

public class ReverseAString {
	public static <E> void main(String[] args) {
/*		String name="India";
		String rev="";
		StringBuilder sb=new StringBuilder(name);
		

		for(int i = name.length()-1; i>=0 ; i--) {
			sb.append(false);
			rev=rev+name.charAt(i);
		}
		System.out.println("Reverse a string is "+rev);
			
	}
			*/
	/*
		String name="my name is";
		String[] split = name.split(" ");
		StringBuilder sb=new StringBuilder(name);
		sb.append(name);
		String rev = "";
		for(int i = split.length-1; i>=0 ; i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println("Reverse a string is "+split);	
			
	}0-=
	}
	*/
		
		LinkedList<Object> ll=new LinkedList<Object>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add("hello");
		
		System.out.println(ll.get(2));
	}
	
}

