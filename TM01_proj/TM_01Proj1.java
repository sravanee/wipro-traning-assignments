import java.util.Scanner;
import java.lang.*;
class TM_02Proj1
{
  public static void main(String[] args)throws Exception
   {
   String Designation="\0";
  String DA="\0";
boolean b;
int g=0;
     //Scanner sc=new Scanner(System.in);
     String Employee2[][]={{"Emp No","Emp Name",
                           "Join Date","Designation Code",
                           "Department","Basic","HRA","IT"},
                     {"1001","Ashish","01/04/2009","e",
                     "R&D","20000",
                     "8000","3000"},
                     {"1002","Sushma","23/08/2012","c",
                     "PM","30000",
                      "8000","3000"},
                     {"1003","Rahul","12/11/2008","k",
                      "ACCt","10000",
                       "8000","1000"},
                     {"1004","Chahat","29/01/2013","r",
                      "Front Desk","12000",
                       "6000","2000"},
                     {"1005","Ranjan","16/07/2005","m",
                      "Engg","50000",
                       "20000","20000"},
                     {"1006","Suman","1/1/2000","e",
                      "Manufacturing","23000",
                       "9000","4400"},
                      {"1007","Tanmay","12/06/2006","c",
                      "PM","29000",
                       "12000","10000"}
                      };
int n=Integer.parseInt(args[0]);
for(int i=1;i<8;i++)
{
  int q=Integer.parseInt(Employee2[i][0]);

  if(q == n)
   {
      g=i;
   }
} 
  if(g!=0)
    { char op=Employee2[g][3].charAt(0);
      switch(op)
       {
         case 'e':
            Designation="Engineer";
            DA="20000";
            break;
         case 'c':
             Designation="Consultant";
             DA="32000";
             break;
         case 'k':
             Designation="Clerk";
             DA="12000";
             break;
        case 'r':
             Designation="Receptionist";
             DA="15000";
             break;
        case 'm':
             Designation="Manager";
             DA="40000";
             break;
        default:
            System.out.println("code not found");
        }
     String v=Designation;
     String z=DA;

     int w=Integer.parseInt(Employee2[g][5])+Integer.parseInt(Employee2[g][6])
               +Integer.parseInt(z)-Integer.parseInt(Employee2[g][7]);
     String salary=Integer.toString(w);
     String Employee1[][]={
                            {"Emp No.","Emp Name","Department",
                                "Designation","salary"},
                            {Employee2[g][0],Employee2[g][1],Employee2[g][4],
                                  v,salary}};
    for(int i=0;i<2;i++)
      { 
        for(int j=0;j<5;j++)
         {  if(i==0)
            {
            System.out.print(Employee1[i][j]+"\t"+"    ");}
            if(i==1)
            {
             System.out.print(Employee1[i][j]+"\t\t");} 
         }
         System.out.print("\n");
      }
     //System.out.println(table(Employee1[][]));
   }
  else
   {                   

     System.out.println("There is no employee with id:"+n);
    
   }

}
}