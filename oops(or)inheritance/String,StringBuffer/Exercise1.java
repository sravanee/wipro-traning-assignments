import java.lang.*;
import java.util.Scanner;
class Exercise1
{
 public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
   String str1=sc.next();
   String str2;
   str2=new StringBuffer(str1).reverse().toString();
   if(str1.equals(str2))
   {
     System.out.println("The given string is palindrom");
   }
   else
   {
     System.out.println("The given string is not palindrom");
   }
 }
}
     