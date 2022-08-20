class pallindromeornot
 {
  public static void main(String args[])
   {
     int r,temp,sum=0;
     int n=121;
     temp=n;
    
   while(n>0)
     {
       r=n%10;
       sum=(sum*10)+2;
       n=n/10;
      }
      if(temp==sum)
        {
          System.out.println(" the number is pallindrome");
          }
        else
          {
             System.out.println("the number is not pallindrome");
           }
            
            
             
}
}
