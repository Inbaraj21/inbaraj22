public class sumdigits
   {
     void add()
     {
      long sum=0;
       long num=8888888888l;
      while(num>0)
        {
         sum=sum+num%10;
         num=num/10;
        
        }
       if (sum<100 && sum>9)
        {
          sum=sum/10+sum%10;
         System.out.println(sum);
        }

      else
       {
       System.out.println(sum); 
       }
      while(sum<100&&sum>9)
         {
           sum=sum/10+sum%10;
          System.out.println(sum);
            
          }
       
      } 
    
   public static void main(String args[])
     {
       sumdigits inba=new sumdigits();
         inba.add();
      }
 }
