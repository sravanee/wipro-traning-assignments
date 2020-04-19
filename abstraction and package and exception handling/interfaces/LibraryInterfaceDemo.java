import java.util.Scanner;
interface LibraryUser
{
  void registerAccount();
  void RequestBook();
}
class KidUsers implements LibraryUser
{
 
 public int age; 
 public void registerAccount()
 {
  System.out.println("Enter the name and age of the person:");
  Scanner sc=new Scanner(System.in);
  String name=sc.nextLine();
  age=sc.nextInt();
  if(age<12)
  {
    System.out.println("you have successfully registered under a kids account");
    }
if(age>12)
  {
   System.out.println("sorry,Age must be less than 12 to register as a kid");
  }
 }
  
 public void RequestBook()
 {
  if(age<12)
{
  System.out.println("enter the category of the book u need to take:");
  Scanner sc=new Scanner(System.in);
  String bookType=sc.nextLine();
if(bookType.equals("kids"))
   {
     System.out.println("Book issued successfully,please return the book with in 10 days ");
    }
    else
   {
     System.out.println("oops,you are allowed to take only kids books");
   }
 }
  }
 
}

  
class AdultUser implements LibraryUser 
{String bookType;
  public int age;
  
  public void registerAccount()
  {
    System.out.println("enter the name and age :");
    Scanner sc=new Scanner(System.in);
    String name=sc.nextLine();
     age=sc.nextInt();
    if(age>12)
     {
      System.out.println("you have successfully registered under an Adult Account");
    }
    if(age<12)
    {
      System.out.println("sorry,age must be greater than 12 to register as an adult");
    }
  }
    
  public void RequestBook()
  {
  if(age>12){
  System.out.println("enter the category of the book u need to take:");
  Scanner sc=new Scanner(System.in);
   bookType=sc.nextLine();
   if(bookType.equals("fiction"))
    {
     System.out.println("book issued sucessfully");
    }
   else
    {
      System.out.println("Oops,you are allowed to take only adult fiction books");
    }
   }
 }
}

class Demo 
{
   public static void main(String[] args)
   {Scanner sc=new Scanner(System.in);
      KidUsers k=new KidUsers();
      AdultUser a=new AdultUser();
      System.out.println("======online library application========");
      System.out.println("1.kid");
      System.out.println("2.adult");
      System.out.println("select the user type");
      int op=sc.nextInt();
      switch(op)
      {
        case 1 :
                
                 k.registerAccount();
                 k.RequestBook();
                 break;
        case 2 :
                  a.registerAccount();
                  a.RequestBook();
                  break;
      default:System.out.println("enter valid one");
      }
   }
}