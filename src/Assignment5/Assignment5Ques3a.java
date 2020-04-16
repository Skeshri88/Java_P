package Assignment5;

public class Assignment5Ques3a 
{
	
	
	 public int balance = 2500;
	    public boolean deposit(int amount){
	        if(amount<0){
	            return false;
	        }
	        this.balance +=amount;
	        return true;
	    }

	    public boolean withdraw(int amount){
	        if(this.balance-amount>0){
	            this.balance -= amount;
	            return true;
	        }
	        else{
	            return false;
	        }
	        
	    }

	
	}


