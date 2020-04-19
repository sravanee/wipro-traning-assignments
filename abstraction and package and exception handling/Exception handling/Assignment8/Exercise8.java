class Exercise8
{
public static void main(String[] args)throws InvalidAgeException
{ 
 String name=args[0];
 int age=Integer.parseInt(args[1]);
try{
  if(age < 18 || age > 60)
    throw new InvalidAgeException();
  else
    System.out.println("name:"+name+"  Age:"+age);
}catch(InvalidAgeException e)
{}
  
}
}