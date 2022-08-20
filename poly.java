/*class poly
  {
    void add()
    {
      int a=12;
      int b=13;
      int c=a+b;
      System.out.println(c);
      }
  void add(int a,int b)
   {
     int c=a+b;
      System.out.println(c);
     }
  void add(int a,int b, int c)
     {
       int d=a+b+c;
        System.out.println(d);
      }
 public static void main(String args[])
  {
    poly in=new poly();
     in.add();
     in.add(2,5);
     in.add(9,8,7);
    }
}*/




class doctor
  {
    void treatment()
    {
      String a=fever;
      String b=injury;
      String c=a+b;
      System.out.println(c);
      }
  void treatment(String a,String b)
   {
     String c=a+b;
      System.out.println(c);
     }
  void treatment(String a,String b, String c)
     {
       String d=a+b+c;
        System.out.println(d);
      }
 public static void main(String args[])
  {
    doctor in=new doctor();
     in.treatment();
     in.treatment(injury,fever);
     in.treatment(injury,fever,cancer);
    }
}
