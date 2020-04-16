import java.util.Scanner;
class Exercise18
{
 public static void main(String[] args)
  {
  // Scanner sc=new Scanner(System.in);
   int n=Integer.parseInt(args[0]);
int o,m,sum=0;
   o=n;
   while(n>0)
   {
    m=n%10;
    sum=sum*10+m;
    n=n/10;
    }
    if(o==sum)
    {
     System.out.println(o+" is a palindrome");
    }
    else
    {
      System.out.println(o+" is not a palindrome");
    }
  }
}
   