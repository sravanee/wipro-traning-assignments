import java.util.Scanner;
class MathOperation
{
  public static void main(String[] args)
  { 
    int a[]=new int[5];
    for(int i=0;i<5;i++)
      {
         args[i]=args[i];
      }
   int sum=0;
   double avg=0;
   try{
    for(int i=0;i<5;i++)
     {
       a[i]=Integer.parseInt(args[i]);
     }
    for(int i=0;i<5;i++)
     {
        sum+=a[i];
     }
    avg=sum/5;
    System.out.println("The sum is :"+sum);
    System.out.println("The avg is:"+avg);
   }
   catch(ArithmeticException e)
   {
     System.out.println(e);
    }
   catch(NumberFormatException e)
   {
     System.out.println(e);
    }
  }
}