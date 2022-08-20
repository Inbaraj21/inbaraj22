class patterntri2
 {
 void add()
   {
     int rows=1;
      for(int i=1;i<=5;i++)
        {
        for(int j=1;j<=i;j++)
         {
          System.out.print("*");
           }
         
      System.out.println();
   }
}
 public static void main(String args[])
   {
      patterntri2 inba=new patterntri2();
       inba.add();
     }
 }
