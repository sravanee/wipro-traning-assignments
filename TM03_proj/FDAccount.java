import java.util.Scanner;
public class FDAccount extends Account 
{
 
 double amount;
 int noOfDays;
 int ageOfAcHolder;
 double interestRate;
 double r;
 Scanner sc=new Scanner(System.in);
 double calculateInterest()
 {
 try{
  System.out.println("Enter the FD amount:");
  amount=sc.nextInt();
 System.out.println("Enter the number of days:");
 noOfDays=sc.nextInt();
 System.out.println("Enter your age:");
 ageOfAcHolder=sc.nextInt();


 if(noOfDays>0)
 {
if(amount<1000000)
{
 if(ageOfAcHolder<60)
  { 
   if(noOfDays>=7 && noOfDays<=14)
     interestRate=4.50;
   else if(noOfDays>=15 && noOfDays<=29)
     interestRate=4.75;
   else if(noOfDays>=30 && noOfDays<45)
     interestRate=5.50;
  else if(noOfDays>=45 && noOfDays<=60)
     interestRate=7;
  else if(noOfDays>=61 && noOfDays<=184)
     interestRate=7.50;
  else if(noOfDays>=185 && noOfDays<=366)
     interestRate=8.00;
  else
    System.out.println("enter the valid maturity period");
   }
 else
  {
   if(noOfDays>=7 && noOfDays<=14)
     interestRate=5.00;
   else if(noOfDays>=15 && noOfDays<=29)
     interestRate=5.25;
   else if(noOfDays>=30 && noOfDays<45)
     interestRate=6.00;
  else if(noOfDays>=45 && noOfDays<=60)
     interestRate=7.50;
  else if(noOfDays>=61 && noOfDays<=184)
     interestRate=8.00;
  else if(noOfDays>=185 && noOfDays<=366)
     interestRate=8.50;
  else
    System.out.println("enter the valid maturity period");
   }
 }
 else
 {
  if(noOfDays>=7 && noOfDays<=14)
     interestRate=6.50;
   else if(noOfDays>=15 && noOfDays<=29)
     interestRate=6.75;
   else if(noOfDays>=30 && noOfDays<45)
     interestRate=6.75;
  else if(noOfDays>=45 && noOfDays<=60)
     interestRate=8;
  else if(noOfDays>=61 && noOfDays<=184)
     interestRate=8.50;
  else if(noOfDays>=185 && noOfDays<=366)
     interestRate=10.00;
  else
    System.out.println("enter the valid maturity period");
   }
 r=(amount*interestRate)/100;
 System.out.println("Interest gained is:Rs."+r);
 return r;
 
 }
else
 {
  throw new NegativeValueException();
 }
}
 catch(NegativeValueException e)
   {}
return r;
     
 }
}

 
  