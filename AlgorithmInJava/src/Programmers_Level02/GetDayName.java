package Programmers_Level02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GetDayName {

	 public static void main(String[] args) throws ParseException
	    {
		 	GetDayName test = new GetDayName();
	        int a=9, b=24;
	        System.out.println(test.getDayName(a,b));
	    }
	 
	 
	 public String getDayName(int a, int b) throws ParseException
	    {
		 	String date ="2017-";
		 	if(a <10)
		 	{
		 		date +="0"+String.valueOf(a)+"-";
		 	}else{
		 		date +=String.valueOf(a)+"-";
		 	}
			if(b <10)
		 	{
		 		date +="0"+String.valueOf(b);
		 	}else{
		 		date +=String.valueOf(b);
		 	}
		 	
		 	
		 	
		 	String dateType = "yyyy-MM-dd";
		 	String day = "" ;
	     
		    SimpleDateFormat dateFormat = new SimpleDateFormat(dateType) ;
		    Date nDate = dateFormat.parse(date) ;
		     
		    Calendar cal = Calendar.getInstance() ;
		    cal.setTime(nDate);
		     
		    int dayNum = cal.get(Calendar.DAY_OF_WEEK) ;
		     
		     
		     
		    switch(dayNum){
		        case 1:
		            day = "SUN";
		            break ;
		        case 2:
		            day = "MON";
		            break ;
		        case 3:
		            day = "TUE";
		            break ;
		        case 4:
		            day = "WED";
		            break ;
		        case 5:
		            day = "THU";
		            break ;
		        case 6:
		            day = "FRI";
		            break ;
		        case 7:
		            day = "SAT";
		            break ;
		             
		    }
		     
		    return day ;
	    }
	 
}
