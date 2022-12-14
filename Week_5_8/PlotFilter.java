//package Java_Code.Week_5_8;

public class PlotFilter {

    public static void main(String[] args)
    {
        //scale as per first four values
        double x0 = StdIn.readDouble();
        double y0 = StdIn.readDouble();
        double x1 = StdIn.readDouble();
        double y1 = StdIn.readDouble();
        StdDraw.setXscale(x0, x1);
        StdDraw.setYscale(y0, y1);

        
        // for bigger points
        //StdDraw.setPenRadius(0.005);

        // to speed up performance, defer displaying points
        //StdDraw.enableDoubleBuffering();

        //read points and plot to standard drawing
        while(!StdIn.isEmpty())
        {
            double x = StdIn.readDouble();
            double y = StdIn.readDouble();
            StdDraw.point(x, y);

        }
        // display all of the points now
        StdDraw.show();


    }
    
}
