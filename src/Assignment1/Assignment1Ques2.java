package Assignment1;

public class Assignment1Ques2 {

	public static void main(String[] args) 
	{
		int min = 0;
	    int max = 1;
	      
	    System.out.println("Random value in double from "+min+" to "+max+ ":");
	    double random_double = Math.random() * (max - min + 1) + min; 
	    System.out.println(random_double);
	    
	    if(random_double<0.5)
	    {
	    	System.out.println("The Value is less than 0.5");
	    }
	    
	    else if(random_double >=0.5)
	    {
	    	System.out.println("The Value is greater or equal to 0.5");
	    }
	        
	      
	    //System.out.println("Random value in int from "+min+" to "+max+ ":");
	    //int random_int = (int)(Math.random() * (max - min + 1) + min);
	    //System.out.println(random_int);

	}

}
