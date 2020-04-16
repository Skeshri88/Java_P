package Assignment3;

import java.util.Scanner;

public class Assignment3Quest1 {

	public static void main(String[] args) 
	{
		Scanner S= new Scanner(System.in);
		System.out.println("Enter the number");
		String sampleString=  S.nextLine();
		
		String[]  stringArrays= sampleString.split("\\s+");
		
		int[] intArray= new int[stringArrays.length];
		int i;
		for(i=0;i<stringArrays.length;i++)
		{
			String numberAsString=stringArrays[i];
			intArray[i]= Integer.parseInt(numberAsString);
			System.out.println(intArray[i]);
		}
		
		
		

	}

}
