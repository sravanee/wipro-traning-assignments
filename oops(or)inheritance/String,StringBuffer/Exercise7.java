import java.util.Scanner;
class Exercise7
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     String str=sc.next();
     int len=str.length();
     for(int i=0;i<len;i++)
      {
        char c=str.charAt(i);
        if('x'==c)
         {
          }
        else
         {
           System.out.print(str.charAt(i));
         }
      }
   }
}
     