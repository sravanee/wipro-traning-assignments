class Author
{
  String name,email;
char gender;
Author(String n,String e,char g)
{
 name=n;
 email=e;
 gender=g;
}
void method()
{
System.out.println("Author Nmae:"+name);
System.out.println("Email:"+email);
System.out.println("Gender:"+gender);
}
}
class Book
{ 
  String name;
  String author;
  double price;
  int qtyInStock;
 /*Book(String n,double p,int q)
  {
    name=n;
    price=p;
    qtyInStock=q;
  }*/
void method1(){
Author obj1=new Author("Chetan Bhagat","chetan105@gmail.com",'f');
obj1.method();
}

public void setname(String n)
{ this.name=n;
}
public void setprice(double p)
{
 this.price=p;
}
public void setqtyInStock(int q)
{
this.qtyInStock=q;
}
public String getname()
{
return name;
}
public double getprice()
{
return price;
}
public int getqtyInStock()
{
return qtyInStock;
}

}
class Encapsulation{
public static void main(String[] args)
{
Book obj=new Book();
obj.setname("The girl in room no 105");
obj.setprice(119d);
obj.setqtyInStock(4);
System.out.println("Book name is:"+obj.getname());
System.out.println("price is:"+obj.getprice());
System.out.println("QtyInStock:"+obj.getqtyInStock());
obj.method1();
}
}

