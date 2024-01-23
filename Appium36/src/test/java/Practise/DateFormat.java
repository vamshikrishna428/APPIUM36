package Practise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateFormat {
	 public static void main(String args[]){  
         int days=5;
	        // create old date in string format  
	        String dateBefore = "2020-07-30";    
	        System.out.println(dateBefore+" is the date before adding days");  
	          
	        // create instance of the SimpleDateFormat that matches the given date  
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
	          
	        //create instance of the Calendar class and set the date to the given date  
	        Calendar cal = Calendar.getInstance();  
	        try{  
	           cal.setTime(sdf.parse(dateBefore));  
	        }catch(ParseException e){  
	            e.printStackTrace();  
	         }  
	             
	        // use add() method to add the days to the given date  
	        cal.add(Calendar.DAY_OF_MONTH, days);  
	        String dateAfter = sdf.format(cal.getTime());  
	          
	        //date after adding three days to the given date  
	        System.out.println("after adding "+days +" days--->"+dateAfter);  
	    }  
	
	
}
