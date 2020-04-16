//Package com.mile1.Main;
import com.mile1.bean.Student;
import com.mile1.exception.*;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain{
 static Student data[]=new Student[6];
  static {
       for(int i=0;i<data.length;i++)
          data[i]=new Student();
       data[0]=new Student("a1",new int[]{34,32,35});
       data[1]=new Student("a2",new int[]{45,43,67});
       data[2]=new Student("a3",new int[]{70,71,75});
       data[3]=new Student("a4",new int[]{91,93,95});
       data[4]=new Student("a5",new int[]{55,63,74});
       data[5]=new Student("a6",new int[]{85,93,87});
        }
 public static void main(String[] args)
  {
    StudentService studentService=new StudentService();
    StudentReport studentReport=new StudentReport();
    System.out.println("Grade Calculation:");
    String x=null;
    for(int i=0;i<data.length;i++)
    {
      try{
          x=studentReport.validate(data[i]);
         }
      catch(NullNameException e)
        {
          x="NullNmaeException occurred";
        }
     catch(NullMarksArrayException e)
       {
          x="NullMarkArrayException occured";
       }
     catch(NullStudentException e)
     {
       x="NullStudentException occurred";
     }System.out.println("GRADE="+x);
   }
  System.out.println("Number of Objects with Marks array as null="
                      +studentService.findNumberofNullMarks(data));
  System.out.println("Number of Objects with Name as null="
                      +studentService.findNumberOfNullName(data));
  System.out.println("Number of objects That are entire null="
                      +studentService.findNumberOfNullObjects(data));
 }
}
                    
        