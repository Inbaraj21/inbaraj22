public class swaping
{
  void swap(int a,int b)
  {
    int t=a+b;
        a=t-a;
        b=t-b;
    System.out.println("after swaping");
    System.out.println("a is"+a);
    System.out.println("b is"+b);
   }
     void swap()
      {
        int a=8;
        int b=6;
        int t=a+b;
            a=t-a;
            b=t-b;
        System.out.println("after swaping");
        System.out.println("a is"+a);
        System.out.println("b is"+b);
       }
          public static void main(String args[])
           {
             swaping id=new swaping();
             id.swap(8,6);
             id.swap();
            }
}
