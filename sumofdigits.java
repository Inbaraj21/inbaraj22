class sumoftwo
  {
    void sum()
     {
       int n= 41;
        if(n>=0 && n<=9)
       {
         int a=n%10;
         int b=n/10;
         int n=a+b;
        System.out.println("the sum of the value is"+n);
       }
        else if(n>=10 && n<=99)
         {
           int a=n%10;
           int b=n/10;
           int t=a+b;
           System.out.println("the sum of the value is "+t);
          }
}
              
             public static void main(String args[])
                {
                   sumoftwo add=new sumoftwo();
                    add.sum();
                 }
    
             
 }

