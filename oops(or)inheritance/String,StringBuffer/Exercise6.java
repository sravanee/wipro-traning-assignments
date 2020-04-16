import java.util.Scanner;
class Exercise6
{
  public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      String str1=sc.next();
      String str2=sc.next();
      int len1=str1.length();
      int len2=str2.length();
      if(len1==len2)
      {
        System.out.print("enter with diff length");
       }
      else
      {
        if(len1<len2)
         {
           System.out.print(str1+str2+str1);
          }
        else
         {
           System.out.print(str2+str1+str2);
          }
       }
   }
}