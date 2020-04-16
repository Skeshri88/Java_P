package Assignment2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Asignment2Question4
{
	
	
  

	public static void main(String[] args)
	{
		try
		{
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of elements you want in array:");
	        int n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter all the elements:");
	        for(int i = 0; i < n; i++)
	        {
	            a[i] = s.nextInt();
	        
	        
	        }
	        System.out.println("Original Array : " + Arrays.toString(a)); 
	        List<int[]> list = Arrays.asList(a); 
	        Collections.reverse(list);
	        
	        System.out.println(list);
	        
	        
	       
	        
	        
		}
		
	       
	            
	            
	       
		
		catch(Exception e)
		{
			System.out.println("Entered numbered is not valid");
		}

	}

}
