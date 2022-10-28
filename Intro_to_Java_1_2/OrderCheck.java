public class OrderCheck {

    public static void main(String[] args)
    {

        if (args.length == 4) {

        Double x = Double.parseDouble(args[0]);
        Double y = Double.parseDouble(args[1]);
        Double z = Double.parseDouble(args[2]);
        Double w = Double.parseDouble(args[3]);

        //
            boolean result = (((x < y) && (y < z) && (z < w)) || ((x > y) && ( y > z) && (z > w)));

                    System.out.println(result);
                } 
            
                else {
                System.out.println("False");
            }
    
        }
        
    }

