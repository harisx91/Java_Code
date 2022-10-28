//package Intro_to_Java_1_4;

public class Sample {

    public static void main(String[] args)
    {

        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        int[] perm = new int[n];

        //initialize perm[]
        for(int j = 0; j < n; j++)
        perm[j] = j;

        //Take sample
        for(int i = 0; i < m ; i++)
        {//Exchange per[i] to a random element to its right

            int r = i + (int) (Math.random() * (n-i));
            int t = perm[r];
            perm[r] = perm[i];
            perm[i] = t;


        }
        //Print sample
        for (int i = 0; i < m; i++)
            System.out.println(perm[i] + " ");
        System.out.println();
    }
    
}
