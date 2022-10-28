//package Intro_to_Java_1_4;

public class CommandLineArgs {

    public static void main(String[] args)
    {
        //DIstinguish between valid and invalid arrays
        int[] bounds;
        bounds = new int[8];

        //first index of an array is 0
        //last index of an array is (array size - 1) ex: 8 - 1 = 7

        for (int i=0; i < bounds.length; i++)
        {
            bounds[i] = i;
        }

        for ( int i = 0; i <= bounds.length-1; i++)
        {
           System.out.println(bounds[i]);
        }

        for( int i = 0; i <= args.length-1; i++)
        {
            System.out.println(args[i]);
        }



    }
    
}
