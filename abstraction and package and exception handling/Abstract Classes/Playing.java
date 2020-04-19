
import java.util.Random;
abstract class Instrument
{
  abstract void play();
}

class Piano extends Instrument
{
 void play()
 {
  System.out.println("Piano is playing tan tan tan");
 }
}

class Flute extends Instrument
{
 void play()
 {
  System.out.println("Flute is playing toot toot toot toot");
 }
}

class Guitar extends Instrument
{
 void play()
 {
  System.out.println("Guitar is playing tin tin tin");
 }
}

class Playing
{
  public static void main(String[] args)
   {
     Instrument[] in=new Instrument[10];
     Random r=new Random();
     
     for(int i=0;i<10;i++)
     {int n=r.nextInt(3)+1;
       switch(n)
        {
          case 1:
                in[i]=new Piano();
               break;
           case 2:
               in[i]=new Flute();
              break;
           case 3:
              in[i]=new Guitar();
              break;
         }
      }
     for(int i=0;i<10;i++)
     {
       if(in[i] instanceof Piano)
           System.out.println("Intrument "+i+" is of type Piano");
       else if(in[i] instanceof Flute)
          System.out.println("Instrumennt "+i+" is of type Flute");
       else if(in[i] instanceof Guitar)
          System.out.println("Instrument "+i+" is of type Guitar");
      in[i].play();
      }
   }
}