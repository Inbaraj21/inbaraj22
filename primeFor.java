public primeFor
{
 void add()
  {
   int count=0;
   int n=7;
   for(int i=1;i<=n;i++)
    {
    if(n%i==0)
      {
       System.out.println("the factros are");
        count++;
         }
        i++;
        }
      
     {   
     if (count==2)
       {
       System.out.println("not prime number");
         }
       else
        {
         System.out.println("prime number");
         }
      }
   
  } 

 public static void main(String args[])
     {
      primeFor inba=new primeFor();
       inba.add();
     }
 }

