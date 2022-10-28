//package Intro_to_Java_1_4;

public class EnhancedFor {

    public static void main(String[] args)
    {

        double[] samples = new double[20];

        for(int i = 0; i < samples.length; i++)
        {
        samples[i] = Math.random();
        }
        //print every double in the array
        for(double var: samples)
        {
            System.out.println(var);
        }

        //Equivalent to
        for (int i = 0; i < samples.length; i++)
        {
            System.out.println(samples[i]);

        }
        
    }
    
}
