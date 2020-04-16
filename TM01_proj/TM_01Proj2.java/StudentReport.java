package com.mile1.service;
import com.mile1.bean.Student;
import com.mile1.exception.*;
class StudentReport
{ 
  public String findGrade(Student studentObject)
   {
     String Grade="";
     int SumOfMarks=0;
     int marksarray[]=studentObject.getMarks();
     for(int i=0;i<marksarray.length;i++)
     {
        if(marksarray[i]<35)
         {
           Grade="F";
           break;
         }
        else
         {
           SumOfMarks=SumOfMarks+marksarray[i];
           if(!Grade.equals("F"))
            {
               if(SumOfMarks<=150)
                 
                    Grade="D";
               else if(SumOfMarks<=200 && SumOfMarks>150)
                     Grade="C";
               else if(SumOfMarks<=250 && SumOfMarks>200)
                    Grade="B";
               else if(SumOfMarks<=300 && SumOfMarks>250)
                    Grade="A";
            }
         }
     }
  }
  public String validate(Student studentObject)throws NullStudentException,NullNameException,NullMarksArrayException
  {
    if(studentObject==null)
       throw new NullStudentException();
    else
     {
          if(studentObject.getName()==null)
           
               throw NullNameException();
          if(studentObject.getmarks()==null)
              throw NullMarksArrayException();
          if(studentObject.getName()!=null && studentObject.getMarks()!=null)
              return findGrade(studentObject);
     }
  }
               
       
