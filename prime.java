 public class prime
  {
   void primecheck()
    {
      int count=0;
      int n=11;
      int i=1;
      boolean flag =false;
     while(i<=n)
       {
        if (n%i==0)
          {
            count ++;
           
            }
           if (count>2)
             {
              flag=true;
              break;
              }
      i++;
         }

         if (flag==true)
            {
             System.out.println("the number is notprime");
             }
          else
            {
              System.out.println("the number is prime");
             }
          System.out.println(count);

       }
   public static void main(String args[])
        {
          prime add=new prime();
            add.primecheck();
          }
}        
