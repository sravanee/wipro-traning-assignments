import java.util.Scanner;
class Exercise11
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String str1=sc.next();
    String str2=sc.next();
    int len1=str1.length();
    int len2=str2.length();
    if(str1.contains(str2))
    {  
     for(int i=0;i<len1;i++)
     {
      char c=str1.charAt(i);
      if(i!=0 && i!=len1-1)
      {
      if(c==str2.charAt(0))
      {
        System.out.print(str1.charAt(i-1));
      }
      else if(c==str2.charAt(len2-1))
      {
        System.out.print(str1.charAt(i+1));
      }
      }
     }
    }
  }
}