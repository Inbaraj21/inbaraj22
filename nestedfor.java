class nestedfor
 {
   void add()
    {
     int i=1;
     int j=1;
     for(i=1;i<=3;i++)
       {
        for(j=1;j<=3;j++)
         {
          System.out.println(i+" "+j);
          }
       }
    }
   public static void main(String args[])
    {
      nestedfor inba=new nestedfor();
       inba.add();
     }
 }
