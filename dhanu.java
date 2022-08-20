public class dhanu
  {
   void swap()
    {
      int x=7;
      int y=5;
      int z=4;
       int temp=x;
       x=y;
        y=z;
        z=temp;
       System.out.println("after swapping");
       System.out.println("x is"+x);
       System.out.println("y is"+y);
       System.out.println("z is"+z);
      }
        void swap(int x,int y,int z)
          {
            int temp=x;
                    x=y;
                    y=z;
                    z=temp;
             System.out.println("after string  ");
              System.out.println("x is"+x);
              System.out.println("y is"+y);
              System.out.println("z is"+z);
            }
                public static void main(String args[])
                 {
                   dhanu swapping=new dhanu();
                          swapping.swap();
                          swapping.swap(4,9,7);
                     }
  
}
