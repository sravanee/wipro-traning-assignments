import java.util.Scanner;
public class RDAccount extends Account 
{
  double interestRate;
  double amount;
double r;
  Integer month;
  double monthlyAmount;
  Integer age;
  Scanner sc=new Scanner(System.in);
  double calculateInterest()
  {
   System.out.println("Enter the amount");
   amount=sc.nextInt();
   System.out.println("enter month period:");
   month=sc.nextInt();
   
   try{
     if(month>0)
    {
     if(age<60)
     { 
       if(month.equals(6))
          interestRate=7.50;
       else if(month.equals(9))
           interestRate=7.75;
       else if(month.equals(12))
           interestRate=8.00;
       else if(month.equals(15))
           interestRate=8.25;
       else if(month.equals(18))
           interestRate=8.50;
       else if(month.equals(21))
           interestRate=8.75;
       else 
           System.out.println("enter valid maturity plan");
      }
      else
        {
          if(month.equals(6))
          interestRate=8.00;
       else if(month.equals(9))
           interestRate=8.25;
       else if(month.equals(12))
           interestRate=8.50;
       else if(month.equals(15))
           interestRate=8.75;
       else if(month.equals(18))
           interestRate=9.00;
       else if(month.equals(21))
           interestRate=9.25;
       else 
           System.out.println("enter valid maturity plan");
        }
    r=(amount*interestRate)/100;
   System.out.println("Interest gained:Rs."+r);
   return r;
     }
     else
       throw new NegativeValueException();
      }catch(NegativeValueException e){}
   return r;
  }
}