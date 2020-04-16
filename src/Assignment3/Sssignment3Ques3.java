package Assignment3;

public class Sssignment3Ques3 {

	public static void main(String[] args) 
	{
		String s[] = "i like this program very much".split(" "); 
        String ans = ""; 
        for (int i = s.length - 1; i >= 0; i--) { 
            ans += s[i] + " "; 
        } 
        System.out.println("Reversed String:"); 
        
        String revserseString =ans.substring(0, ans.length() - 1);
        System.out.println(revserseString); 
        
        
        String[] words= revserseString.split(" ");
        String revserseString1="";
        
        for(int i=0;i<words.length;i++)
        {
        	String word= words[i];
        	String reverseWord= "";
        
        for(int j=word.length()-1;j>=0;j--)   	
        {
        	reverseWord= reverseWord+word.charAt(j);
        		
        }
        
        revserseString1=revserseString1+reverseWord+ " "; 
        }
        
        System.out.println(revserseString1);
        
        
        
        
        

	}

}
