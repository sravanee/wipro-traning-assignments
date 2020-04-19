package com.automobile;
import com.automobile.Vehicle;
public class Honda extends Vehicle
{
  public int getSpeed(int speed)
  {
    System.out.println(speed);
    return speed;
  }
  public void cdplayer()
  {
   System.out.println("accessing cd player");
  }
}