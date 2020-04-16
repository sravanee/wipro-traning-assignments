import java.util.Scanner;
class Exercise6
{
public static void main(String[] args) 
{
     Scanner SC=new Scanner(System.in);
     String gender=SC.next();
     String male="male";
String female="female";
     int age=SC.nextInt();
if(gender.equals(male) || gender.equals(female))
 {
    if(gender.equals(male)) {if (age>=1 && age<=58)
  {
   System.out.println("the percentage of interest is 8.4%.");
  }
  else if(age>=59 && age<=100)
  {
   System.out.println("the perentage of interest is 10.5%.");
  }}
  else if(gender.equals(female)) {if (age>=1 && age<=58)
  {
   System.out.println("the percentage of interest is 8.2%.");
  }
 else if (age>=59 && age<=100)
  {
   System.out.println("the percentage of interest is 9.2%.");
  }}
  else
  {
   System.out.println("enter the valid");
  }
}
else
{
    System.out.println("enter a valid gender");
  
 }

}
}
