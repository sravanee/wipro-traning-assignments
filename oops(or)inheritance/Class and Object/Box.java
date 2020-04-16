class Box
{
 public int width;
 public int height;
 public int depth;
public int vol;
 float volume;

  Box(int w,int h,int d)
  {
    width=w;
    height=h;
    depth=d;
  }
  void cal()
  {
    vol=width*height*depth;
    System.out.println(vol);
  }
  public static void main(String[] args)
  {
    Box b1=new Box(5,4,6);
    b1.cal();
  }
}