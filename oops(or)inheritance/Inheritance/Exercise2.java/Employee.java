class Employee extends Person
{
 public double annualsalary;
 public String stin;

Employee()
{
}
void setannualsalary(double s)
{
 this.annualsalary=s;
}
void setstin(String i)
{ this.stin=i;
}
void getannualsalary()
{
System.out.println(annualsalary);
}
void getstin()
{
System.out.println(stin);
}
}
