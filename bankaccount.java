class parents
{
  void savings()
   {
    int watch=2;
     int car=1;
     System.out.println("10 laks");
    }
 }
class child extends parents
{
  void savings()
   {
    String name="inbaraj";
     int mobile=1;
      int cycle=1;
       System.out.println("1k");
    }
 }
public class bankaccount
 {
   public static void main(String args[])
  {
   parents p1=new child();
    p1.savings();
    
 }
}
