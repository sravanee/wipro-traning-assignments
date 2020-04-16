import java.util.Scanner;
class Exercise14
{
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
   int count=0;
int n=0;

int len=args.length;
if(len == 0)
{
System.out.println("Plese enter an integer number");
//int n=sc.nextInt();
}
else
{
  n=Integer.parseInt(args[0]);  

if(n==0 ||n==1)
{
System.out.println(n+" is neither prime nor composite");
}
else if(n>=2)
{
   for(int i=1;i<=n/2;i++)
   {
     if(n%i==0)
      {
        count=count+1;
      }
    }
   if(count<=2)
   {
     System.out.println("The given number is prime number");
   }

   else
  {
    System.out.println("The given number is not prime number");
   }
}
}
}
}

