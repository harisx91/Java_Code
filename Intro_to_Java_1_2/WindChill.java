//package Intro_to_Java_1_2;

public class WindChill {

    public static void main(String[] args){

        double temp_T = Double.parseDouble(args[0]);
        double vol_V = Double.parseDouble(args[1]);

        double w = 35.74 + 0.6215*temp_T + (0.4275*temp_T - 35.75)  *  Math.pow(vol_V , 0.16);

        System.out.println("Temperature " + temp_T);
        System.out.println("Wind speed " + vol_V);
        System.out.println("Wind Chill " + w);
    }
    
}
