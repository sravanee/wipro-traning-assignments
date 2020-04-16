class Person
{
  String name,dob;
 void method(String n,String d)
  {
    this.name=n;
    this.dob=d;
    System.out.println(name+"\n"+dob);
  }
}
class Teacher extends Person
{
  int sal;
  String sub;
  void method1(int s,String su)
 {
   this.sal=s;
   this.sub=su;
   System.out.println(sal+"\n"+sub);
  }
}
class Student extends Person
{
 String id;
 void method2(String i)
{
 this.id=i;
System.out.println(id);
}
}
class CollegeStudent extends Student
{
 String collegename,year;
 void method3(String c,String y)
{
this.collegename=c;
this.year=y;
System.out.println(collegename+"\n"+y);
 }  }
class Exercise3{
public static void main(String[] args)
{
 Person p=new Person();
p.method("some","12-03-199");
Teacher t=new Teacher();
t.method1(30000,"max");
Student s=new Student();
s.method2("16MA522");
CollegeStudent c=new CollegeStudent();
c.method3("QIS","fourth");
}
}