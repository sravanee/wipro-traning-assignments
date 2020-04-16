package com.mile1.service;
 import com.mile1.bean.Student;
public class StudentService
 {
   public int findNumberOfNullMarks(Student data[])
    {
      int countOfNullMarks=0;
      for(int i=0;i<data.lenght;i++)
       {
         if(data[i].getMarks()==null && data[i]!=null)
           {
              countOfNullMarks++;
           }
        }
        return countOfNullMarks;
     }
    public int findNumberOfNullNmaes(Student data[])
    {
      int countOfNullNames=0;
      for(int i=0;i<data.length;i++)
       {
         if(data[i].getName()==null && data[i]!=null)
           {
             countOfNullNames++;
           }
        }
       return countOfNullNames;
    }
  public int findNumberOfNullObjects(Student data[])
    {
      int countOfNullObjects=0;
      for(int i=0;i<data.length;i++)
      {
         if(data[i]==null)
          {
            countOfNullObjects++;
          }
      }
      return countOfNullObjects;
    }
}