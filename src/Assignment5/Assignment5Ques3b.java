package Assignment5;

import java.util.Scanner;

public class Assignment5Ques3b 
{
	public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Assignment5Ques3a bankTom = new Assignment5Ques3a();
        Assignment5Ques3a bankJack = new Assignment5Ques3a();
        while(true){
            int choice, amount = 0;
            System.out.println("1-Deposit to Tom bank account\n2-Withdraw from Tom bank account");
            System.out.println("3-Deposit to Jack bank account\n4-Withdraw from Jack bank account");
            System.out.println("Press anything else proceeding with Enter key to exit");
            choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the amount to be depositted in Tom's account:");
                    amount = scanner.nextInt();
                    if(bankTom.deposit(amount)){
                        System.out.println("Depositted successfully!\nRemaining balance:"+bankTom.balance);
                    }
                break;
                case 2:
                    System.out.println("Enter the amount to withdraw from Tom's account:");
                    amount = scanner.nextInt();
                    if(bankTom.withdraw(amount)){
                        System.out.println("Amount withdrawn successfully!\nRemaining balance:"+bankTom.balance);
                    }
                break;
                case 3:
                    System.out.println("Enter the amount to be depositted in Jack's account:");
                    amount = scanner.nextInt();
                    if(bankJack.deposit(amount)){
                        System.out.println("Depositted successfully!\nRemaining balance:"+bankJack.balance);
                    }
                break;
                case 4:
                    System.out.println("Enter the amount to withdraw from Tom's account:");
                    amount = scanner.nextInt();
                    if(bankJack.withdraw(amount)){
                        System.out.println("Amount withdrawn successfully!\nRemaining balance:"+bankJack.balance);
                    }
                break;
                default:
                System.out.println("Exiting...");
                break;
            }
            if((choice!=1)&&(choice!=2)&&(choice!=3)&&(choice!=4)){
                break;
                
            }
        }
        scanner.close();
    }
}


