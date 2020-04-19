package com.automobile.twowheeler;
import com.automobile.Vehicle;
public class Hero extends Vehicle
{
  public int getSpeed(int speed)
  {
    System.out.println(speed);
    return speed;
  }
  public void radio()
  {
    System.out.println("accessing the radio");
  }
}