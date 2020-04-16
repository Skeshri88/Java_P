package Assignmet4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Assignment4Ques4 {

	public static void main(String[] args)
	{
		Date currentDate= new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("MM/dd/yyyy  HH:mm:ss");
		System.out.println(sdf.format(currentDate));
		

	}

}
