public class Distance {

    public static void main(String[] args){

        //parse x- and y-coordinate from command line 
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        //distance to (0,0)
        double dist = Math.sqrt(x*x + y*y);

        //output distance
        System.out.println("Distance from ( " + x + ", " + y + " )  to (0,0) = " + dist);
        //System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);


    }
    
}
