import java.util.Scanner;
class Exercise10
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String str1=sc.next();
    int n=sc.nextInt();
    int len=str1.length();
    for(int i=0;i<n;i++)
    {

    for(int j=n-1;j<len;j++)
     {
       System.out.print(str1.charAt(j));
     }
    }
   }
}