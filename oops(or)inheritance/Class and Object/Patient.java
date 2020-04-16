class Patient
{
 public String patientname;
public double height,width,result;
Patient(String pn,double h,double w)
{
patientname=pn;
height=h;width=w;
}
double computeBMI()
{
 result=width/(height*height);
 /*System.out.println(result);*/return result;
}
public static void main(String[] args)
{
 Patient p=new Patient("mine",5,50);
System.out.println(p.computeBMI());
}
}