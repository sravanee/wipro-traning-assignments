class Exercise1
{
public static void main(String[] args)
{
int n=Integer.parseInt(args[0]);
if(n>=1)
{
System.out.println("The "+n+" is Positive");
}
else if(n<0)
{
System.out.println("The "+n+" is Negative");
}
else
{
System.out.println("The "+n+" is Zero");
}
}
}