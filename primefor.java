class primefor
 {
  void sub()
   {
      int n=121;
      int count=0;
     for(int i=1;i<=121;i++)
       {
        if(n%i==0)
        {
        
         count++;
        }
  }
     
      if(count==2)
      {
       System.out.println ("given number is  prime" );
      }

     else
       {
        System.out.println ("given number is not   prime");
        }
   }

public static void main(String args[])
    {
       primefor inba=new primefor();
         inba.sub();
       }
 }
