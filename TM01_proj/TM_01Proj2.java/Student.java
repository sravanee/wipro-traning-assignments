package com.mile1.bean;
public class Student
{
 // public static void main(String[] args)
   //{
     String name;
     int[] marks;
    
     public Student(String name,int[] marks)
     {
        this.name=name;
        this.marks=marks;
     }
      public Student()
     {
       /*name=name;
       marks=marks;*/
     }
      public String getName()
     {
        return name;
     }
     public int[] getMarks()
     {
       return marks;
     }
     public void setName(String name)
     {
       this.name=name;
     }
     public void setMarks(int[] marks)
     {
       this.marks=marks;
     }
  
}