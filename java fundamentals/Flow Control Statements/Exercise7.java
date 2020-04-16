import java.util.Scanner;
class Exercise7
{
public static  void main(String[] args)
{
Scanner sc=new Scanner(System.in);
char ch1;

 char ch=sc.next().charAt(0);
if(Character.isLowerCase(ch))
{
ch1=Character.toUpperCase(ch);
}
else
{
ch1=Character.toLowerCase(ch);
}
System.out.println(ch+"->"+ch1);
}
}