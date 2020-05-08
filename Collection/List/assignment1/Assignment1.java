package assignment1;
import java.text.SimpleDateFormat;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.time.Month;
public class Assignment1{
   public static void main(String[] args)
   {
     ArrayList<String> a=new ArrayList<String>();
     String[] months=new DateFormatSymbols().getMonths();
     for(int i=0;i<(months.length-1);i++)
     {
       String month=months[i];
       a.add(month);
     }
     
      System.out.println(a);
     
    }
}