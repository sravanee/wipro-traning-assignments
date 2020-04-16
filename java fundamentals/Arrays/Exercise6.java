import java.util.Scanner;
class Exercise6
{
 public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
   int temp,r=0,k=0;
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
{ if(i<len-1){
     System.out.print(a[i]+" ");
}else{
System.out.println(a[i]);}

  }
   
   
   for(int i=0;i<len;i++)
  {
   for(int j=i+1;j<len;j++)
   {
    if(a[i]>a[j])
{
  temp=a[i];
  a[i]=a[j];
  a[j]=temp;
}
}
}
for(int i=0;i<len;i++)
{if(i<len-1){

System.out.print(a[i]+" ");}
else{
System.out.print(a[i]);}

}

}
}
     