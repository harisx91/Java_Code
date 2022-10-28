public class RGBtoYIQ {

    public static void main(String[] args){

       //double value = Math.sin(Double.parseDouble(args[0])) + Math.cos(Double.parseDouble(args[0]));

        //System.out.println(value);

       // double a = (Math.sqrt(2) * Math.sqrt(2) == 2);

        int a = Integer.parseInt(args[0]);

        int b = Integer.parseInt(args[1]);

        int c = Integer.parseInt(args[2]);

        int sum = a + b + c;


        //boolean   
        
        if ( (a + b) >= sum 
            || (a + c) >= sum 
            || (b + c) >= sum){
            
            System.out.println("false");
        }
            else {
                System.out.println("true");
            }

            //System.out.println(sum);
        }



        
        
       //System.out.println(a);

        //System.out.println('b' + 'c');

        //System.out.println((char) ('a' + 4));



    }