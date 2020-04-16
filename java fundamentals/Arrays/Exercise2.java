class Exercise2
{ 
public static void main(String[] args)
 { int n,temp;
   int a[]={4,3,2,6,5};
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
System.out.println("the minimun value of array is:"+a[0]);
System.out.println("The maximum value of array is:"+a[n-1]);
}
}