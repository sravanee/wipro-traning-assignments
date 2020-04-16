import java.util.Scanner;
class Exercise19
 {
public static void main(String[] args)
{
int n=0,count=0;
  while(count<5)
{
  if(n%2==0)
   {
    if(n%3==0)
     {
      if(n%5==0)
       {
        System.out.println(n);
        count=count+1;
       }
     }
    }
n++;
 }
}
}