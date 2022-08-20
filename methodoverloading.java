class methodoverloading
{
  void show(int num1)
   {
   System.out.println("number:"+num1);
  }
void show(int num1,int num2)
{
  System.out.println("number:"+num1+"number:"+num2);
   }
public static void main(String args[])
 {
   methodoverloading mo=new methodoverloading();
      mo.show(1);
      mo.show(4,80);
    }
}
