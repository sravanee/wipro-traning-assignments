import java.util.Scanner;
class Exercise9
{
  public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      String str1=sc.next();
      String str2=sc.next();
      int len1=str1.length();
      int len2=str2.length();
      if(len1==len2)
      {
      for(int i=0;i<len1;i++)
       {
        System.out.print(str1.charAt(i));
         
           System.out.print(str2.charAt(i));
          
        }
      }
      else if(len1<len2)
      {
         for(int i=0;i<len1;i++)
       {
        System.out.print(str1.charAt(i));
         
           System.out.print(str2.charAt(i));
          
        }for(int i=len1;i<len2;i++)
         {
            System.out.print(str2.charAt(i));
         }
       }
       else if(len1>len2)
       {
          for(int i=0;i<len2;i++)
       {
        System.out.print(str1.charAt(i));
         
           System.out.print(str2.charAt(i));
          
        }for(int i=len2;i<len1;i++)
          {
            System.out.print(str2.charAt(i));
          }
        }
    }
}
           