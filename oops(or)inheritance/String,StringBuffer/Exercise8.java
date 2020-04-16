import java.util.Scanner;
class Exercise8
{
 public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    int len=str.length();
    for(int i=0;i<len;i++)
    { 
      if('*'!=str.charAt(i))
        {
           if(i!=0 && i!=len-1)
            {if('*'!=str.charAt(i+1) && '*'!=str.charAt(i-1)){
              System.out.print(str.charAt(i));}
            }
            else
             {
               System.out.print(str.charAt(i));
             }
         } 
     }
  }
}  