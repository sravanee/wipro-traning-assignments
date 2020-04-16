import java.util.Scanner;
class Exercise5
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     String str=sc.next();
     int len=str.length();
     for(int i=1;i<len-1;i++)
     {
       System.out.print(str.charAt(i));
      }
    }
 }
     
     
     