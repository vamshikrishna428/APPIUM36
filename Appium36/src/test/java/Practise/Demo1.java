package Practise;
	
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;
	
public class Demo1 {
	public static void main(String[] args) {
		ArrayList<Object> array=new ArrayList<Object>();
		array.add(10);
		array.add("Array");
		System.out.println(array);
		
		
		Vector<Object> vec=new Vector<Object>();
		vec.add(200);
		vec.add(500);
		vec.add(350);
		vec.add(510);
		Enumeration enu=vec.elements();
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}	
