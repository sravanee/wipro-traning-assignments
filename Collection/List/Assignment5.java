import java.util.LinkedList;
import assignment1.Assignment1;
import java.text.SimpleDateFormat;
import java.text.DateFormatSymbols;
import java.time.Month;
public class Assignment5{
   public static void main(String[] args)
   {
     LinkedList<String> a=new LinkedList<String>();
     String[] months=new DateFormatSymbols().getMonths();
     for(int i=0;i<(months.length-1);i++)
     {
       String month=months[i];
       a.add(month);
     }
     
      System.out.println(a);
     
    }
}