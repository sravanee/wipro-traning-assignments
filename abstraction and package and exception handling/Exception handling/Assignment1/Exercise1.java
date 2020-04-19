import java.util.Scanner;
class Exercise1
{
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 System.out.println("enter an interger:");
 String str=sc.nextLine();
 try
  {
   int n=Integer.parseInt(str);
   System.out.println("The square value is:"+n*n);
   System.out.println("The work has done done successfully");
  }
  catch(NumberFormatException e)
  {
    System.out.println("Entered input is not a valid format for an integer.");
  }
}
}