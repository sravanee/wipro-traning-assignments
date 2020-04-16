class Exercise1
{
 public static void main(String[] args)
{ int n,sum=0,avg=0;
  int a[]={2,3,4,5,6};
n=a.length;
  for(int i=0;i<n;i++)
  {
    sum=sum+a[i];
   }
    avg=sum/n;
    System.out.println("sum of the array is:"+sum);
    System.out.println("average of the array is:"+avg);
}
}