import java.util.Scanner;
class InterestCalculator
{
  public static void main(String[] args)
  { 
    Scanner sc=new Scanner(System.in);
    System.out.println("MAIN MENU");
    System.out.println("----------");
    System.out.println("1.Interest Calculator-SB");
    System.out.println("2.Interest Calculator-FD");
    System.out.println("3.Interest Calculator-RD");
    System.out.println("4.Exit");
    FDAccount fd=new FDAccount();
    SBAccount sb=new SBAccount();
    RDAccount rd=new RDAccount();
    System.out.println("Enter your Option(1..4):");
    int op=sc.nextInt();
    switch(op)
     {
         case 2:
                fd.calculateInterest();
                break;
         case 1:
                sb.calculateInterest();
                break;
         case 3:
                rd.calculateInterest();
                break;
        case 4:
                System.exit(0);
                break;
        default:
              System.out.println("Enter valid option");
     }
    
  }
}