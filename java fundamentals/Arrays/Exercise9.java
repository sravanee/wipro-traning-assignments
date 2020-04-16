
class Exercise9
{
public static void main(String[] args)
{

int i=2,j=2,k=0;
int a[][]=new int[i][j];
int len=args.length;
if(len<4)
{
System.out.println("Please enter four integer numbers");}
else{for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
a[i][j]=Integer.parseInt(args[k]);k++;}}
System.out.println("the given array is:");
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
System.out.print(a[i][j]);
}System.out.print("\n");
}
System.out.println("The reverse of the array is:");
for(i=1;i>=0;i--)
{
for(j=1;j>=0;j--)
{
System.out.print(a[i][j]);
}
System.out.print("\n");
}
}
}}