package Practise;

public class SegregateAlphaNumericSpecial {
	public static void main(String[] args) {
		String s = "cvraman123@!#$%";
		String Alpha = "";
		String Number = "";
		String SpecialChar = "";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'){
				Alpha=Alpha+ch;
			}
			else if(ch>='0' && ch<='9') {
				Number=Number+ch;
			}
			else {
				SpecialChar=SpecialChar+ch;
			}
		}
		System.out.println("Alphabets in given string are : "+Alpha);
		System.out.println("Numbers in given string are :"+Number);
		System.out.println("Special charecters in given string are :"+SpecialChar);

	}
}
