public  class primefor1
{
 void add()
  {
   int count=0;
   int n=178;
   for(int i=1;i<=n;i++)
    {
    if(n%i==0)
      {
       System.out.println("the factors are "+i);
        count++;
         }
        
        }
      {  
     if (count==2)
       {
       System.out.println(" prime number");
         }
       else
        {
         System.out.println(" not prime number");
         }
      }
  }

 public static void main(String args[])
     {
      primefor1 inba=new primefor1();
       inba.add();
     }
 }

