package Assignmet4;

import java.util.Scanner;

public class Assignment4Ques3 {

	public static void main(String[] args)
	{
		
		solveSimultaneousEquations(3,4,5,3,4,5);
	

	}

	private static void solveSimultaneousEquations(double n, double m, double a, double b, double c1, double c2) {
		double det = 1/ ((n) * (a) - (m) * (a));
	    double x = ((a) * (b) - (m) * (c2)) / det;
	    double y = ((n) * (c2) - (a) * (c1)) / det;
	    System.out.println("x=" + x + " y=" + y);
	    
		
	}

}
