import java.util.Scanner;
class Exercise13
{
public static void main(String[] args)
{

for(int n=11;n<=99;n++)
{
 int count=0;
  for(int i=1;i<=n/2;i++)
  {

   if(n%i==0)
   {
     count=count+1;
   }
  }

 
 if(count<=2)
 {
 System.out.println(n);
 }
}
}
}


