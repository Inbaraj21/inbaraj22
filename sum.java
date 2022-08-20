class sum
 {
   void plus()
     {
      int n=1234;
      int i=1;
      int sum=0;
       for( i=1;n>0;)
        {
          sum=sum+n%10;
           n=n/10;
           }
       System.out.println(sum);
         }
   public static void main(String args[])
     {
        sum inba=new sum();
          inba.plus();
       }
}
   
