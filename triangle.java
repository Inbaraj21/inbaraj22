 class triangle

{
 void add()
  {
   for(int row=1;row<=4;row++)
    {
     
      for(int space=3;space>=row;space--)
       {
        System.out.print(" ");
        }
        for(int star=1;star<=row;star++)
         {
          System.out.print("*");
           
        }
      for(int col=1;col<row;col++)
        {
          System.out.print("*"); 
          }
         System.out.println();
       }
  }

 public static void main(String args[])
  {
    triangle t=new triangle();
     t.add();
   }
}


/*class triangle

{
 void add()
  {
   for(int row=1;row<=4;row++)
    {
     
      for(int col=1;col<=row;col++)
       {
        System.out.print(col);
        }
        
         {
          System.out.println();
         }
       }
  }

 public static void main(String args[])
  {
    triangle t=new triangle();
     t.add();
   }
}*/





/* class triangle

{
 void add()
  {
   for(int row=1;row<=4;row++)
    {
     
      for(int space=3;space>=row;space--)
       {
        System.out.print(" ");
        }
        for(int star=1;star<=row;star++)
         {
          System.out.print("*");
           
        }

        for(int col=1;col<=4;col++)
         {
            for( col=1;col<=4;col++)
          {
          System.out.print(col);
           }
         
         System.out.println();
       }
  }
}
 public static void main(String args[])
  {
    triangle t=new triangle();
     t.add();
   }
}*/

