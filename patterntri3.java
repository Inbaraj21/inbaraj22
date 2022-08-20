class patterntri3
 {
  void plus()
   {
     int rows=1;
    for(int i=1;i<=6;i++)
     {
      for(int j=1;j<=6;j++)
       {
        if (i==5||j==3||i+j==3)
         {
          System.out.print("*" +");
          }
}
       else
        {
        System.out.print(" "+" ");
         }
        
       System.out.println();
       }
   }


public static void main(String args[])
  {
   patterntri3 me=new patterntri3();
     me.plus();
    }
}
   
