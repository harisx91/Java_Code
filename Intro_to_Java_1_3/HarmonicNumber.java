//package Intro_to_Java_1_3;

public  class HarmonicNumber {


public static void main(String[] args)
{
    int n = Integer.parseInt(args[0]);
    double sum = 0.0;
    for (int i = 1; i <=n; i++)
    {// add the ith term to the sum
    
        sum += 1.0/i;

    }

    System.out.println(sum);

    /* 
    double[] harmonic = new double[n];
    for (int i = 1; i < n; i++);
    harmonic[i] = harmonic[i - 1] + 1.0/i;
    */



}
    
}
