import java.util.Random;
abstract class Compartment
{
   abstract String notice();
}

class First extends Compartment
{
  String notice()
  {
    System.out.println("first class compartment");
    return "first class compartment";
  }
}

class Ladies extends Compartment
{
  String notice()
  {
    System.out.println("ladies compartment");
       return "ladies compartment";
  }
}

class General extends Compartment
{
   String notice()
  {
    System.out.println("general compartment");
    return "general compartment";
  }
}

class Luggage extends Compartment
{
   String notice()
  {
    System.out.println("luggage compartment");
    return "luggage compartment";
  }
}
 
class TestCompartment
{
  public static void main(String[] args)
  {
    Compartment c[]=new Compartment[10];
    Random r=new Random();
    for(int i=0;i<10;i++)
     {
        int n=r.nextInt(4)+1;
        switch(n)
         {
           case 1:
                c[i]=new First();
                break;
          case 2:
                c[i]=new Ladies();
                break;
         case 3:
                c[i]=new General();
                break;
          case 4:
                c[i]=new Luggage();
                break;
         }
      }
    for(int i=0;i<10;i++)
    {
      c[i].notice();
    }
   }
}
  
  
  
  