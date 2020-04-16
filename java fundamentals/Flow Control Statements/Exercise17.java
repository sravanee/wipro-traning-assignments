import java.util.Scanner;
class Exercise17
{
  public static void main(String[] args)
  {
    int m,sum=0;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    while(n>0)
    {
      m=n%10;
      sum=sum*10+m;
      n=n/10;
    }
   System.out.println(sum);
 }
}
      