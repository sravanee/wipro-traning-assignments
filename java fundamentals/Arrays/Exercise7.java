import java.util.Scanner;
class Exercise7
{
 public static void main(String[] args)
 {
int j;
   Scanner sc=new Scanner(System.in);
   int len=6;
  // System.out.print("Enter the array elements are:");
   int a[]=new int[len];
int b[]=new int[len];
   for(int i=0;i<len;i++)
   {
     int value=sc.nextInt();
     a[i]=value;
   }
/*System.out.println("The array elements are:");
  for(int i=0;i<len;i++)
{
     System.out.print(a[i]);

   }*/

for(int i=0;i<len;i++)
{
for(j=0;j<i;j++)
{
if(a[i]==a[j])
{
break;
}
}
if(i==j){if(i<len-1){
System.out.print(a[i]+",");}
else{
System.out.println(a[i]);}
}
}
}
}
     