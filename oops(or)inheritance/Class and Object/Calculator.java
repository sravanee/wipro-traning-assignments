
class Calculator
{
 
 static double r1,r;

 static void powerInt(int num1,int num2)
  {
   r=Math.pow(num1,num2);
   System.out.println(r);
   }
  static void powerDouble(double num1,int num2)
  {
  r1=Math.pow(num1,num2);
  System.out.println(r1);
  }
  public static void main(String[] args)
  {
   Calculator obj=new Calculator();
 Calculator obj1=new Calculator();
   obj.powerInt(4,2);
   obj1.powerDouble(6d,2);
  }
}
   