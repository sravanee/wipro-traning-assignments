import java.util.Scanner;
class Exercise3
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String str1=sc.next();
    int len=str1.length();
    for(int i=0;i<len;i++)
    {
       System.out.print(str1.charAt(0));
       System.out.print(str1.charAt(1));
    }
  }
}
    