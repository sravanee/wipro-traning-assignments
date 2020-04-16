
import java.util.Scanner;
class Exercise5
{
public static void main(String[] args)
{
Scanner scanner=new Scanner(System.in);
char c=scanner.next().charAt(0);
if((c>='a'&& c<='z')||(c>='A'&& c<='Z'))
{
System.out.println("Alphabet");
}
else if(c>='0'&& c<='9')
{
System.out.println("Digit");
}
else
{
System.out.println("Special Character");
}
}
}