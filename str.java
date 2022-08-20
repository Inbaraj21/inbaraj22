public class str
  {
    void swap(int n,int m,int l)
     {
       int d=n+m+l;
           n=d-(n+m+l);
           m=d-(n+m+l);
           l=d-(n+m+l);
       System.out.println("after the string");
       System.out.println("n is"+n);
       System.out.println("m is"+m);
       System.out.println("l is"+l);
        }
          void swap()
            {
              int n=3;
              int m=6;
                int l=9;
               int d=n+m+l;
                   n=d-(n+m+l);
                   m=d-(n+m+l);
                   l=d-(n+m+l);
               System.out.println("after the string");
               System.out.println("n is"+n);
               System.out.println("m is"+m);
               System.out.println("l is"+l);
              }
                  public static void main(String args[])
                    {
                       str raina=new str();
                         raina.swap();
                          raina.swap(6,2,1);
                     }
}
                          
