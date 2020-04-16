
class Exercise16
{
  public static void main(String[] args)
   {  int i=1;
      
     int len=args.length;
if(len==0)
{
System.out.println("Please enter an integer number");
}else
{
int n=Integer.parseInt(args[0]);
      while(i<=n)
      {
        for(int j=1;j<=i;j++)
         {
          System.out.print("*");
          
          }
          System.out.print("\n");
         i++;
      }
   } }
 }
         