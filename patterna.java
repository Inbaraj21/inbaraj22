class patterna
{
  void add()
  {
   for(int row=1;row<=5;row++)
    {
      for(int col=1;col<=5;col++)
      {
        if (row==1 ||row==(5/2)+1 ||col==row ||col==5)
         {
          System.out.println("*");
           }
         else
          {
           System.out.println(" ");
          }
      }
  }
}
public static void main(String args[])
 {
    patterna p=new patterna();
     p.add();
  }
}
