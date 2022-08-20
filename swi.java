class swi
   {
     void days()
      {
        int d=8;
        switch(d)
        {

          default:
               {
                System.out.println("the answer is invalid");
               break;
               }
          case 1: 
             {
               System.out.println("the answer is monday ");
               break;
             }
          case 2:
             {
               System.out.println("the answer is tusday");
               break;
              }
           case 3:
              {
               System.out.println("the answer is wednesday");
               break;
               }
           case 4:
              {
               System.out.println("the answer is thrusday");
               break;
               }
             /* default:
               {
                System.out.println("the answer is invalid");
                break;
               }*/
           case 5:
               {
               System.out.println(" the answer is friday");
               break;
                }
            case 6:
                {
               System.out.println("the answer is saturday");
               break;
                }
             case 7:
               {
                System.out.println("the answer is sunday"); 
               break;
               }
            
             }

}

      public static void main(String args[])
         {
           swi weak=new swi();
           weak.days();
         }
      
   
 }

