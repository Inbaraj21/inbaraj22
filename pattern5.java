/*class pattern5
{
 void add()
 {
  int row=1;
  for( row =1;row<=3;row++)
   {
     for(int col=1;col<=row;col++)
      {
      System.out.print(row);
       }
   System.out.println();
  }
}
public static void main (String args[])
  {
   pattern5 p=new pattern5();
   p.add();
 }
}*/




class pattern5
{
 void add()
 {
  int row=1;
  for( row =3;row>=1;row--)
   {
     for(int col=3;col>=row;col--)
      {
      System.out.print(row);
       }
   System.out.println();
  }
}
public static void main (String args[])
  {
   pattern5 p=new pattern5();
   p.add();
 }
}
