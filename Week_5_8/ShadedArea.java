//package Java_Code.Week_5_8;

public class ShadedArea {

    public static double readRadius()
    {
        StdOut.print("Enter the radius of the circle radius: ");
        double radius = StdIn.readDouble();
        return radius; 

    }

    //compute radius circle: PI * radius ^ 2
    //one argument method 
    public static double computeCircleArea(double radius)
    {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
    
    //use static method with and without return values in the program code
    //display the circle area for a given radius
    public static void displayCircleArea(double radius, double area)
    {
        StdOut.println("The area od the circle with radius " + radius + " is " + area);
        return; //return back to the caller method
    }
    
    //reads redius for a bunch of circle
    public static double[] readSeveralRadius()
    {
        StdOut.print("Enter a bunch of circle radius: ");
        double[] radiusArray = StdIn.readAllDoubles();
        return radiusArray;
    }

    //compute the circle area for all the array radius
    public static double[] computeSeveralCircleArea(double[] radius)
    {
        double[] areas = new double[radius.length];
        for(int i = 0; i < radius.length; i++)
        {
            areas[i] = computeCircleArea(radius[i]);
        }
        return areas;
    }
    public static void main(String[] args)
    {
        //(7.1f)Explain and illustrate the call the call stack for a program that includes multiple methods
        double outerRadius = readRadius();
        double innerRadius = readRadius();
        double outerArea = computeCircleArea(outerRadius); //blue circle area
        double innerArea = computeCircleArea(innerRadius); //red circle area
        double shadedArea = outerArea - innerArea;
        StdOut.println("Shaded area is : " + shadedArea);

    }
    
}
