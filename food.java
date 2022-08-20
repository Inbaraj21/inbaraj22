class animal
{
  void eating()
  {
   int leg=4;
   System.out.println("veg"+"non veg");
   }
}
 class cow extends animal
{
   void eating()
   {
    System.out.println("veg");
    }
}
public class food
{
  public static void main(String args[])
  {
    animal an=new cow();
     an	.eating();
     
  }
}

