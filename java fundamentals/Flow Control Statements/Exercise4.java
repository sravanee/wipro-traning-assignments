
import java.util.Scanner;
class Exercise4
{
public static void main(String[] args)throws Exception
{
Scanner scanner=new Scanner(System.in);

char a=scanner.next().charAt(0);
char b=scanner.next().charAt(0);
int ascii=a;
int castAscii2=(int) b;
if(a<b)
{
System.out.print(a+","+b);
}
else
{
System.out.println(b+","+a);
}
}
}