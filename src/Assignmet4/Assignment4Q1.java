package Assignmet4;

import java.util.Scanner;

public class Assignment4Q1
{
	public static void main(String args[])
	  {
	    int first, second, add, substract, multiply;
	    float devide;
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter Two Numbers : ");
	    
	    
	    first = scanner.nextInt();
	    second = scanner.nextInt();
	    
	    System.out.println("Add as 1/substract as 2/multiply as 3/devide as 4");
	    
	    String  number= scanner.next();
	    
	    //add= first+second;
	    
	    switch(number)
	    {
	    case "add":
	    	add= first+second;
	    	System.out.println(add);
	        break;
	        
	        
	    case "subs":
	    
	    	substract= first-second;
	    	System.out.println(substract);
	    	
	    	break;
	    	
	    case "multiply":
	    	multiply = first * second;
	    	System.out.println(multiply);
	    	break;
	    	
	    
	    case "divide":
	    	
	    	devide = (float) first / second;
	    	System.out.println(devide);
	    	break;
	    	
	    		    	
	    	
	    }    	    
	    
	  }
	}	


