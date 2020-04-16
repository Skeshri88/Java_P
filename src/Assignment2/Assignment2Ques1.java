package Assignment2;

import java.util.Scanner;

public class Assignment2Ques1
{
	{
	 try (Scanner scanner = new Scanner(System.in)) {
         System.out.print("Please enter first letter: ");
         String firstLetter = scanner.nextLine();
         System.out.print("Please enter second Letter: ");
         String secondletter = scanner.nextLine();

         
         System.out.println("firstLetter : " + firstLetter);
         System.out.println("secondletter : " + secondletter);
         // Displays the total number of W present in the given string
         //System.out.println("Total number of W in first string: " + StringUtils.countMatches(firstLetter, "w"));
         //System.out.println("Total number of W in a second string: " + StringUtils.countMatches(secondletter, "w"));
         System.out.println("firstLetter : " + firstLetter.toUpperCase());
         System.out.println("secondletter : " + secondletter.toUpperCase());
         System.out.println("firstLetter and second Letter : " + firstLetter.concat(secondletter));
     }
     

 }

}
		

