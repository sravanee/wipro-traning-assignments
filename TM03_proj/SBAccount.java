import java.util.Scanner;
public class SBAccount extends Account
{
 double interestRate;
 double amount;
 String typeOfAccount;
 Scanner sc=new Scanner(System.in);
 double calculateInterest()
 {
  System.out.println("Enter the average amount in your account:");
  amount=sc.nextInt();
  System.out.println("enter type of account:");
  typeOfAccount=sc.next();
  if(typeOfAccount.equals("Normal"))
    interestRate=4;
  if(typeOfAccount.equals("NRI"))
    interestRate=6;
  double r=(amount*interestRate)/100;
  System.out.println("Interest gained:Rs."+r);
  return r;
  }
}