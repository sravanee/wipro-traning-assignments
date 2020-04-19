package com.automobile;
import com.automobile.Honda;
import com.automobile.twowheeler.Hero;
import com.automobile.Vehicle;
class Exer3
{
  public static void main(String args[])
  {
    Hero hero=new Hero();
    hero.getSpeed(85);
    hero.radio();
    Honda honda=new Honda();
    honda.getSpeed(110);
    honda.cdplayer();
   }
}
