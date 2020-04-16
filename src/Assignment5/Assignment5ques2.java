package Assignment5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Assignment5ques2 
{
	
	public long daysBetween(Date one,Date two)
	{
		long difference=(one.getTime()-two.getTime())/86400000;
		return Math.abs(difference);
	}
	

	public static void main(String[] args) throws ParseException
	{
		Date today= new Date();
		Calendar myNextCalender= Calendar.getInstance();
		myNextCalender.set(2020,2,14);
		
		Date nyd= myNextCalender.getTime();
		
	 
		Assignment5ques2 t=new Assignment5ques2();
		long days= t.daysBetween(today, nyd);
		
		System.out.println(days+ "  days");
		
		
		SimpleDateFormat sdf= new SimpleDateFormat("MM/dd/yyyy");
		String todayDate=sdf.format(today);
		String newYearDay=sdf.format(nyd);
		//System.out.println(days + " days from today's date of "+ todayDate + "untill" + newYearDay);
		
		
		if(days>6570)
		{
			System.out.println("Eligible for voting");
		}
		
		else if(days>21900)
		{
			System.out.println("You are a senior citizen");
		}
		
		else if(days<6570)
		{
			System.out.println("you are not eligible for voting");
			
		}
		
		else 
		{
			System.out.println("Not born ");
		}
				
		
		
		
		
		
				
		
		
		
		
		
		
		
	}

}
