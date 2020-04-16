class Vedio
{
  String videoName; 
  boolean checkout;
  int rating;
  boolean returned;
  int count;
  String getName()
   { 
     return name; 
     System.out.println("vedio "+name +"added successfully.");
   }
  void doCheckout(boolean status)
  { 
   checkout=status;
  }
  void doReturn(boolean status)
  { 
   returned=status;
  }
  void receiveRating(int rating)
  {  
    rating=((rating*count)+rating)/(count+1);
    count++;
    //getRaking();
    //System.out.println("rating"+rating+"has been mapped to the vedio"+name+".");
  }
  int getRating()
  {
  
   return rating;
   }
  boolean getCheckout()
  {
    return checkout;
   } 
 boolean getReturn()
 {
   return returned;
 }
  Vedio(String name)
  {
    videoName=name;
    count=1;
    checkout=false;
    returned=true;
    rating=9;
    
  }
 }
class VedioStore
{
 private Video[] videos;
 int c;
 boolean isOpen;
 VideoStore(int n)
 {
   videos=new video[n];
   c=0;
   isOpen=true;
}
 void setIsOpen(boolean open)
 {
   isOpen=open;
 }
 void addVedio(String name)
  {
    videos[c]=new video(name);
    c++;
   // System.out.println("Enter the name of the vedio you want to add:"name);
    //getname();
  }
  void doCheckout(String name)
  {
   for(int i=0;i<c;i++)
   {
     if(videos[i].getNmae().equals(name))
     {
       if(!videos[i].getCheckout())
        {
          videos[i].doCheckout(true);
          videos[i].doReturn(false);
          return true;
        }
      }
    }
   return false;
       
    //System.out.println("Enter the name of the vedio you want to check out:"name);
    
   // doCheckout();
  }
  void doRetrun(String name)
  { 
    for(int i=0;i<c;i++)
     {
      if(videos[i].getName().equals(nmae))
       {
         videos[i].doCheckout(false);
         videos[i].doReturn(true);
          break;
       }
      }

    //System.out.println("Enter the vedio you want to Return:"name);
    //doReturn();
  }
  void receiveRating(String name,int rating)
  {
    for(int i=0;i<;i++)
     {
       if(videos[i].getName().equals(name))
        {
          videos[i].recieveRating(rating);
           break;
         }
      }
    //System.out.println("Enter the vedio you want to rate:"name);
    //System.out.println("Enter the rating for this vedio:"rating);
    //receiveRating(rating);
  }
  void listInventory()
  {
    System.out.println("----------------------------------------------------------------------");
    System.out.println("Vedio Name"+"   "+"|"+"   "+"Checkout Status"+"  "+"|"+"  "+"Rating");
    for(int i=0;i<;i++)
     {
      System.out.print("%10s    ",videos[i].getName());
      System.out.print(:%6.1f    ",videos[i].getRating());
      if(videos[i].setCheckout())
        System.out.print("%6s     ","Yes");
      else
        System.out.print("%6s    ","No");
      }
       
    System.out.println("----------------------------------------------------------------------");
  }
}
class VedioLauncher
{ 
  public static void main(String[] args)

  {  
   Scanner sc=new Scanner(System.in);
   VideoStore store=new VideoStore(10);
  do{
   System.out.println("MAIN MENU");
   System.out.println("============");
   System.out.println("1.Add Videos:");
   System.out.println("2.Check Out Video:");
   System.out.println("3.Return Video:");
   System.out.println("4.Receive Rating:");
   System.out.println("5.List Inventory:");
   System.out.println("6.Exit:");
   System.out.println("Enter your choice(1..6):");
   Scanner sc=new Scanner(System.in);
   int op=sc.nextInt();
   switch(op)
    {
      case '1':
         System.out.print("Enter the name of the video you want to add:");
         String videoNmae=sc.next();
         store.addVideo();
         break;
      case '2':
         System.out.print("Enter the name of the video you want to checkout:");
         videoNmae=sc.next();
         if(!store.doCheckout(name))
            System.out.println("video is already checkeout");
         break;
      case '3':
          System.out.print("Enter the name of the video you want to return:");
         videoNmae=sc.next();
          store.doReturn(name);
         break;
     case '4':
        System.out.print("Enter  the name of the video you want to rate:");
        videoName=sc.next();
        System.out.print("Enter the rating of the vedio:");
        int rating=sc.nextInt();
        store.receiveRating(name,rating);
        break;
     case '5':
       store.listInventory();
       break;
     case '6':
       store.setIsOpen(false);
       break;
     default:
       System.out.println("enter valid option");
    }
   }while(store.isOpen);
  }
}
      