import java.util.Scanner;
class Exercise4
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    int len=str.length();
    int n=len/2;
    if(len%2==0)
    {
      for(int i=0;i<n;i++)
      {
        System.out.print(str.charAt(i));
      }
    }
   else
   {
     System.out.print("null");
   }
  }
}