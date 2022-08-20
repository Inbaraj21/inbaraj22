class ration
  {
    int cardNo;
    int familyMembers;
    String productName;
    char productPrize;
{
    void details()
     {
       System.out.prinln("cardNo:"+cardNo+"\n"+"familymembers:" +familyMembers+"\n"+"productname:" +productName+"\n"+"productprize:" +productPrize+"\n");
     }
     public static void main(String args[])
      {
        ration mn=new ration();
           mn.cardno= 21;
           mn.familyMembers=5;
           mn.productName="sugar";
           mn.productPrize=44;
          mn.details();
    }
