package Assignmet4;

import java.util.Scanner;

public class Assignment4Ques2 {

	public static void main(String[] args) 
	{
		int num1,num2,num3;
		int smallest = 0,middle = 0,biggest = 0;
		
		Scanner S = new Scanner(System.in);
	    System.out.print("Enter Two Numbers : ");
	    
	    num1 = S.nextInt();
	    num2 = S.nextInt();
	    num3 = S.nextInt();
	    
	    if ((num1 < num2) && (num1 < num3))
	    {
	        smallest = num1;
	        if (num2 > num3)
	        {
	            biggest = num2;
	            middle = num3;
	        }
	    }
	    
	    if ((num1 < num2) && (num3 < num1))
	    {
	        smallest = num1;
	        if (num2 < num3)
	        {
	            middle = num2;
	            biggest = num3;
	        }
	    }
	    if ((num1 > num2) && (num3 > num1))
	    {
	        middle = num1;
	        if (num2 < num3)
	        {
	            smallest = num2;
	            biggest = num3;
	        }
	    }
	    if ((num1 < num2) && (num3 < num1))
	    {
	        middle = num1;
	        if (num2 > num3)
	        {
	            biggest = num2;
	            smallest = num3;
	        }
	    }
	    if ((num1 > num2) && (num1 > num3))
	    {
	        biggest = num1;
	        if (num3 > num2)
	        {
	            middle = num3;
	            smallest = num2;
	        }
	    }

	    if ((num1 > num2) && (num1 > num3))
	    {
	        biggest = num1;
	        if (num2 > num3)
	        {
	            middle = num2;
	            smallest = num3;
	        }
	    }
	    
	    System.out.println("Ascending no  " + smallest+ " "+ middle+ " "+biggest);
	    System.out.println("Descending no  "+ biggest+ " "+ middle+ " "+smallest);

	    

	}

}
