import java.util.Scanner;
class Exercise15
{
 public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
   int m,sum=0;
   int n=sc.nextInt();
   while(n>0)
   {
     m=n%10;
     sum=sum+m;
     n=n/10;
    }
  System.out.println(sum);
 }
}
