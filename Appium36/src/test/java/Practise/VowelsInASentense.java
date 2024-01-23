package Practise;

import java.util.Scanner;

public class VowelsInASentense {
	public static void main(String args[]){
		int count = 0;
		System.out.println("Enter a sentence :");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
/*		String space = sentence.replaceAll("\\s+", "");	// to remove spaces
		System.out.println(space);
   		
		*/
	//		sentence=sentence.toLowerCase();	//converts all uppercase letters to lower case letters 
		for (int i=0 ; i<sentence.length(); i++){
			char ch = sentence.charAt(i);
			if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == 'A'|| ch == 'E'|| ch == 'I' ||ch == 'O' ||ch == 'U')
			{
				count ++;
				System.out.print(" vowels are :" +ch +","); 	//will print vowels
			}
		}
		System.out.println("  Number of vowels in the given sentence is "+count);
	}
}
//my NAME IS VAMSHIKRISHNA i love my country


