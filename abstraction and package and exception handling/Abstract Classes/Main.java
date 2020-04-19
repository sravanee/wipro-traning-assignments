abstract class GeneralBank
{
  abstract double getSavingInterestRate();
  abstract double getFixedDepositInterestRate();
}

class ICICIBank extends GeneralBank
{ 
  double getSavingInterestRate()
  {
    return 4;
  }
  double getFixedDepositInterestRate()
  {
    return 8.5;
  }
}

class KotMBank extends GeneralBank
{
  double getSavingInterestRate()
   {
     return 6;
   }
  double getFixedDepositInterestRate()
  {
     return 9;
  }
}

class Main
{
 public static void main(String[] args)
 { 
   ICICIBank i=new ICICIBank();
   KotMBank k=new KotMBank();
   GeneralBank g=new KotMBank();
   GeneralBank g1=new ICICIBank();
   System.out.println("ICICIBank-"+"Fixed Rate:"+i.getFixedDepositInterestRate()+"% and"+
                     "Saving Rate:"+i.getSavingInterestRate()+"%");
  System.out.println("KotMBank-Fixed Rate:"+k.getFixedDepositInterestRate()+"% and"+
                      "Saving Rate:"+k.getSavingInterestRate()+"%");
 System.out.println("GeneralBank1-"+"Fixed Rate:"+g.getFixedDepositInterestRate()+"% and"+
                     "Saving Rate:"+g.getSavingInterestRate()+"%");
 System.out.println("GeneralBank2-"+"Fixed Rate:"+g1.getFixedDepositInterestRate()+"% and"+
                     "Saving Rate:"+g1.getSavingInterestRate()+"%");
 }
}
  
