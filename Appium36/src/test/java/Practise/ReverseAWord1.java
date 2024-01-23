package Practise;

public class ReverseAWord1 {

	public static void main(String[] args) {
		String s="welcome to testyantra"; 
		
	    String[] st = s.split(" ");
		for(int i=0;i<st.length-1;i++)
		{
			for(int j=st[i].length()-1;i>=0;i--) {
				System.out.print(st[i].charAt(j));	
			}
		    
		}

	}

	

	}

		
