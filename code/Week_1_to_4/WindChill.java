public class WindChill {

    public static double GetWindChill(double T, double V)
    
    {
    
        double W = 35.74 + 0.6215 * T - 35.75 * Math.pow(V, 0.16) + 0.4275 * T * Math.pow(V, 0.16);
        return W;
    }
    public static void main(String [] args)
    {
    if(args.length != 2)
    {
    System.out.println("Invalid number of arguments.");
    return;
    }
    
    double temperature = Double.parseDouble(args[0]);
    
    double mph = Double.parseDouble(args[1]);
    
    System.out.println("The windchill factor is: " + GetWindChill(temperature, mph));
    
    }
    
}
    
