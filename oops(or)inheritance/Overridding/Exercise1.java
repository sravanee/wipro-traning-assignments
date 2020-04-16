class Fruit
{
  String name,taste;
  char size;
  Fruit(String n,String t)
  {
    name=n;
    taste=t;
  }
  void eat()
  {
    System.out.println("Name:"+name);
    System.out.println("Taste:"+taste);
  }
}
class Apple extends Fruit
{
  Apple(String n,String t)
  {
    super(n,t);
  }
  void eat()
  {
   System.out.println("apple Taste:"+taste);
  }
}
class Orange extends Fruit
{
  Orange(String n,String t)
  {
    super(n,t);
  }
  void eat()
  {
   System.out.println("orange Taste:"+taste);
  }
}
class Exercise1
{
 public static void main(String[] args)
 {
   Fruit f=new Fruit("graph","sweet");
   Apple a=new Apple("apple","juicy");
   Orange o=new Orange("orange","sorce");
   Fruit fr;
  f.eat();
  a.eat();
  o.eat();
 }
}
   
  