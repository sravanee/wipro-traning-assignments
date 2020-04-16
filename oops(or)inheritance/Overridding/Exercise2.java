class Shape
{
  void draw()
  {
    System.out.println("Drawing shape");
  }
  void erase()
  {
    System.out.println("Erasing shape");
  }
}
class Circle extends Shape
{
  void draw()
  {
   System.out.println("Drawing Cricle");
  }
  void erase()
  {
    System.out.println("Erasing Circle");
  }
}
class Triangle extends Shape
{
  void draw()
  {
   System.out.println("Drwaing Triangle");
  }
  void erase()
 {
  System.out.println("Erasing Triangle");
 }
}
class Square extends Shape
{
  void draw()
  {
    System.out.println("Drawing Square");
  }
  void erase()
  {
    System.out.println("Erasing Square");
  }
}
class Exercise2
{
  public static void main(String[] args)
  {
    Shape c=new Circle();
    Shape t=new Triangle();
    Shape s=new Square();
    c.draw();
    c.erase();
    t.draw();
    t.erase();
    s.draw();
    s.erase();
  }
}
  