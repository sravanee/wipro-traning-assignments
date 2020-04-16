import java.util.Scanner;
class Exercise8
{
 public static void main(String[] args)
  { int i,m=0,k=0,sum=0,sum1=0,sum2=0,sum3=0;
    Scanner sc=new Scanner(System.in);
    int len=sc.nextInt();
int x[]=new int[len];
System.out.print("Array elements-");
    for(i=0;i<len;i++)
    {
      int val=sc.nextInt();
      x[i]=val;}
for(i=0;i<len;i++){
if(i<len-1)
{
System.out.print(x[i]+",");
}
else
{
System.out.println(x[i]);
}
    }
for(i=0;i<len;i++)
{if(x[i]==6){m=i;

for(int j=i+1;j<len;j++)
{
if(x[j]==7){
k=j;}}}}
for(i=0;i<len ;i++){
if(i >= m){if(i<= k){sum1=sum+x[i];}else{sum2=sum2+x[i];}}
else{
sum=sum+x[i];}
}
sum3=sum2+sum;
System.out.println(sum3);

}
}      
     
