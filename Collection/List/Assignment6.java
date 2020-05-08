import java.util.Vector;

import assignment1.Assignment1;

import java.text.SimpleDateFormat;
import java.text.DateFormatSymbols;
import java.time.Month;
public class Assignment6{
   public static void main(String[] args)
   {
     Vector<String> a=new Vector<String>();
     String[] months=new DateFormatSymbols().getMonths();
     for(int i=0;i<(months.length-1);i++)
     {
       String month=months[i];
       a.add(month);
     }
     
      System.out.println(a);
     
    }
}