public class swap
  {
    void swaping()
    {
      int n=7;
      int m=11;
      int l=n+m;
          m=l-m;
          n=l-m;
       System.out.println("after swaping");
       System.out.println("n is"+n);
       System.out.println("m is"+m);
      }
        void swaping(int n,int m)
         {
           int l=n+m;
               n=l-n;
               m=l-m;
           System.out.println("after swaping");
           System.out.println("n is"+n);
           System.out.println("m is"+m);
          }
        public static void main(String args[])
         {
           swap inba=new swap();
             inba.swaping();
             inba.swaping(4,8);
          }
    }
           


