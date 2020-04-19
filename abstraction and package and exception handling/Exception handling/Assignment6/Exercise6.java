import java.util.Scanner;
class Exercise6
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in); 
    for(int i=0;i<2;i++)
    {
      String name="";    
      int m1=0;
      int m2=0;
      int m3=0;
   
    try{
       
       name=sc.next();
       if(sc.hasNextInt())
          m1=sc.nextInt();
       else
          throw new NumberFormatException();
       if(sc.hasNextInt())
          m2=sc.nextInt();
       else
          throw new NumberFormatException();
       if(sc.hasNextInt())
          m3=sc.nextInt();
       else
         throw new NumberFormatException();
        if(m1<0)throw new NegativeValueException();
        if(m1>100)throw new ValuesOutOfRangeException();
        if(m2<0)throw new NegativeValueException();
        if(m2>100)throw new ValuesOutOfRangeException();
        if(m3<0)throw new NegativeValueException();
        if(m3>100)throw new ValuesOutOfRangeException();
        }
        catch(NumberFormatException e)
         {
             System.out.println(e);
         }
        catch(NegativeValueException e)
         {
             System.out.println(e);
         }
        catch(ValuesOutOfRangeException e)
         {
              System.out.println(e);
         }
     
    System.out.println("name:"+name);
    System.out.println("marks1:"+m1);
    System.out.println("marks2:"+m2);
    System.out.println("marks3:"+m3);
  }
 sc.close();
}
}
 



  

   