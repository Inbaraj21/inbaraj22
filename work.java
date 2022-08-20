public class work
  {
    void swap(int x,int y,int z)
     {
       int a=x+y+z;
       int x=a-(x+y);
       int y=a-(x+y);
       int z=a-(x+y);
       System.out.println("after swaping");
       System.out.println("x is"+x);
       System.out.println("y is"+y);
       System.out.println("z is"+z);
        }
          void swap()
           {
            int x=7;
            int y=9;
            int z=3;
             int a=x+y+z;
                 x=a-(x+y);
                 y=a-(x+y);
                 z=a-(x+y);
             System.out.println("after the swaping");
             System.out.println("x is"+x);
             System.out.println("y is"+y);
             System.out.println("z is"+z);
              }
                  public static void main(String args[])
                    {
                      work inba=new work();
                       inba.swap(7,8,6);
                       inba.swap();
                       }
   }
