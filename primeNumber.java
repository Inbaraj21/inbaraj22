class primeNumber
  {
   void primeCheck()
    {
       int count=0;
      int n=12;
      int i=1;
   while(i<=n)
    {
      if(n%i==0)
       
  {  System.out.println("n s factor is " +i);
        count++;
         }
      
       i++;
       }
{

 
        if (count == 2)
           {
            System.out.println("the number is prime");
            }
        else
           {
           System.out.println("the number is not prime");
           }
}
}
    
      public static void main(String args[])
           {
             primeNumber add=new primeNumber();
               add.primeCheck();
            }
}
