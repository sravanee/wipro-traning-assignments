public class InvalidAgeException extends Exception
{
 public InvalidAgeException()
  {
   super();
   System.out.println("The age must be between 18 to 60 only");
  }
}