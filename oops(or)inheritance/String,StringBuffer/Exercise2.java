import java.util.Scanner;
class Exercise2
{
 public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String str1=sc.next();
    String str2=sc.next();
    int len1=str1.length();
    char ch1=str1.charAt(len1-1);
    char ch2=str2.charAt(0);
    if(ch1==ch2)
    {
       System.out.println(str1+str2.substring(1));
    }
    else
    {
      System.out.println(str1+" "+str2);
    }
  }
}
    
