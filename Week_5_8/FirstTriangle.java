//package Java_Code.Week_5_8;

public class FirstTriangle {

    public static void main(String[] args)
    {
        double t = Math.sqrt(3.0)/2.0;
        StdDraw.line(0.0, 0.0, 1.0, 0.0);
        StdDraw.line(1.0, 0.0,0.5, t);
        StdDraw.line(0.5,t,0.0,0.0);
        StdDraw.point(0.5, t/3.0);

        //StdDraw.setXscale(x0, x1);
        //StdDraw.setYscale(y0, y1);

        int n = 100;
        StdDraw.setXscale(0, n);
        StdDraw.setYscale(0, n);
        for(int i = 0; i <= n; i++)
        StdDraw.line(0,n-i, i, 0);

    }
    
}
