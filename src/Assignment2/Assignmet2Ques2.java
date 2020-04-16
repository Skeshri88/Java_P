package Assignment2;

import java.time.LocalDate;

public class Assignmet2Ques2 {

	public static void main(String[] args) 
	{
		LocalDate birthdayDate = LocalDate.parse("2019-03-27");
        System.out.println("Birthday  --" + birthdayDate);
        LocalDate dayLater = birthdayDate.minusDays(90);
        System.out.println(
                "Birthday after 90 days --" + dayLater.getDayOfWeek() + "," + dayLater.getMonth() + ", " + dayLater.getDayOfMonth() + "," + dayLater.getYear());
    }


	}


