import java.util.Scanner;
class Exercise2
{
 public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
   try{
       System.out.println("Enter the number of elements in the array");
       int s=sc.nextInt();
       int a[]=new int[s];
       System.out.println("Enter the elements in the array");
       for(int i=0;i<s;i++)
       {
         a[i]=sc.nextInt();
       }
       System.out.println("Enter the index of the array element you want to acess");
       int r=sc.nextInt();
       System.out.println("The array element at index"+r+"="+a[r]);
       System.out.println("The array element successfully accessed");
       }
   catch(ArrayIndexOutOfBoundsException e)
     {
        System.out.println(java.lang.ArrayIndexOutOfBoundsException);
     }
  }
}
