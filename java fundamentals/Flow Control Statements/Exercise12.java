import java.util.Scanner;
class Exercise12
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int count=0;
int n=sc.nextInt();
for(int i=1;i<=n/2;i++)
{
if(n%i==0)
{
count=count+1;
}}

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
