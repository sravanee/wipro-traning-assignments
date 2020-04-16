class Exercise10
{
public static void main(String[] args)
{

int i=3,j=3,k=0;
int l,m,max=0;
int a[][]=new int[i][j];
int len=args.length;
if(len<9)
{
System.out.println("Please enter four integer numbers");}
else{for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
a[i][j]=Integer.parseInt(args[k]);k++;}}
System.out.println("the given array is:");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(a[i][j]+" ");
}System.out.print("\n");
}
for(i=0;i<3;i++)
{for(j=0;j<3;j++)
{for(l=0;l<3;l++)
{for(m=0;m<3;m++){
if(a[i][j]>a[l][m]){a[i][j]=a[i][j];}
else{
a[i][j]=a[l][m];}}}}}
System.out.println("The biggest number in the given array is "+a[0][0]);
}
}}