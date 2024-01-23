package Practise;

public class PractiseDoWhile {

	public static void main(String[] args) {
//		int i=0;	// Initialize Counter 
//		do{
//			//	Put Your Code here
//			//	Increment or Decrement Counter
//			System.out.println(i + " Hello");
//			i++;
//		}
//		while(i<3);
		int i=0;
		do {
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}
			while(i<=20);
		}
	}



// -->	print "Hello"  --> i++  --> i=1 ,  --> 1 < 3 --> True;
//-->	print "Hello"  --> i++  --> i=2 ,  --> 2 < 3 --> True;
//-->	print "Hello"  --> i++  --> i=3 ,  --> 3 < 3 --> False; 
				//	 End-Of-Loop --> Loop Terminates