//package Intro_to_Java_1_2;

public class Ruler {

    public static void main(String[] args)
    {
        
            //String ruler1 = "1";
            //String ruler2 = ruler1 + "2" + ruler1;
            //String ruler3 = ruler2 +"3" + ruler2;
            //String ruler4 = ruler3 + "4" + ruler3;
            //System.out.println(ruler1);
            //System.out.println(ruler2);
            //System.out.println(ruler3);
            //System.out.println(ruler4);

            //int a;
            //a = 2^16;
            //System.out.println(a);
                
            //double b = Math.round(6.022e23);
            //System.out.println(b);
         int N = Integer.parseInt(args[0]);
         String ruler = " ";

         for (int i = 1; i <= N ; i++){
             ruler = ruler + i + ruler;

            
            System.out.println(ruler);
         }

                
    }
    
}
