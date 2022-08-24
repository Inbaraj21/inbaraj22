abstract class pen
{
 abstract void models();
      
   void writing()
      {
        System.out.println(" the pen is writing well");
      }
    }
   class stylishpen extends pen
   {
     void models()
       {
        System.out.println(" the stylishpen is one of the model in pen");
       }
       void writing()
      {
        System.out.println(" the pen is writing well");
      }



    }
public class write
{
public static void main(String args[])
  {
    pen p1 =new stylishpen();
    p1.models();
    p1.writing();
   }
}
