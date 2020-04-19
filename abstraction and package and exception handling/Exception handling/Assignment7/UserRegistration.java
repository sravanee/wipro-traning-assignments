import java.util.Scanner;
class UserRegistration
{ 
 
 void registerUser(String username,String userCountry)//throws InvalidCountryException
 { try{
   if(userCountry.equals("india"))
    
      System.out.println("User registration done sucessfully");
    
   else
    throw new InvalidCountryException();
    }catch(InvalidCountryException e)
     {
      System.out.println("User Outside India cannot be registered");
     }
 
 
}
public static void main(String[] rgs)
{
  Scanner sc=new Scanner(System.in);

  UserRegistration u=new UserRegistration();
   String name=sc.next();
   String country=sc.next();
  u.registerUser(name,country);
}
}