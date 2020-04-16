class Animal
{
 void eat(){}
 void sleep(){}
}
class Bird extends Animal
{ 
  void eat(){}
  void sleep(){}
  void fly(){}
}
class Exercise1{
public static void main(String[] args)
{
  Animal a=new Animal();
  a.eat();
  a.sleep();
  Bird b=new Bird();
  b.eat();
  b.sleep();
  b.fly();
}}