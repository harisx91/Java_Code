//package Intro_to_Java_1_4;

public class CommandLineArgs {

    public static void main(String[] args)
    {
        //DIstinguish between valid and invalid arrays
        int[] bounds = new int[8];

        //first index of an array is 0
        //last index of an array is (array size - 1) ex: 8 - 1 = 7

        for (int i=0; i < bounds.length; i++)
        {
            bounds[i] = i;
        }

        for ( int i = 0; i <= bounds.length-1; i++)
        {
           System.out.println("Bound is " +bounds[i]);
        }

        for( int i = 0; i < args.length; i++)
        {
            System.out.println(args[i]);
        }

        double[][] a;
        a = new double[m][n];
        
        for (int i = 0; i < m; i++)
        { //Computing the average for row i
            double sum_m = 0.0;
            for(int j = 0; j < n; j++)
            sum += a[i][j] 
            a[i][n] = sum/n; 
        }
        {
            for(int j = 0; j < n; j++)
            {///Computing average for each column j
            double sum_n= 0.0;
            for(int i = 0; i< m; i++ )
            {
                sum_n += a[i][j];
                a[m][j] = sum / m;

            }
            }

        }

        double[][] ab = new double[n][n];
        for(int i=0; i < n; i++)
            for(int j = 0; j < n; j++)
            c[i][j]= a[i][j] + b[i][j];


    }
    
}
