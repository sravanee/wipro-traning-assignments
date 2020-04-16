import java.util.Scanner;
class Exercise3
{
 public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
   int r=0,k=0;
   int len=sc.nextInt();
   System.out.print("Enter the array elements are:");
   int a[]=new int[len];
   for(int i=0;i<len;i++)
   {
     int value=sc.nextInt();
     a[i]=value;
   }
System.out.println("The array elements are:");
  for(int i=0;i<len;i++)
{
     System.out.print(a[i]);

   }
System.out.print("\n");
System.out.print("The searching element:");
int s=sc.nextInt();

   for(int i=0;i<len;i++)
   {
    if(a[i]==s)
     {
      k=1;
r=i;
break;
      
     }
else{
k=0;
}
    }
     if(k==1)
{ 
System.out.println(r);
}
else
{
System.out.println("-1");
}
}
}
     