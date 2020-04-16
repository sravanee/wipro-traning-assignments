class Exercise5
{ 
public static void main(String[] args)
 { int n,temp;
   int a[]={4,3,2,6,5,9,1};
   n=a.length;
   for(int i=0;i<n;i++)
  {
   for(int j=i+1;j<n;j++)
   {
    if(a[i]>a[j])
{
  temp=a[i];
  a[i]=a[j];
  a[j]=temp;
}
}
}
System.out.println("the small 2 numbers of array is:"+a[0]+" "+a[1]);
System.out.println("The large 2 numbers of array is:"+a[n-1]+" "+a[n-2]);
}
}