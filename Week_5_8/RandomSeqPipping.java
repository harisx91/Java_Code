//package Java_Code.Week_5_8;

public class RandomSeqPipping {

    public static void main(String[] args)
    {

    int n = Integer.parseInt(args[0]);
    for ( int i = 0; i < n; i++)
    {
        StdOut.println(1 + (int)(Math.random() * 1000));
    }


    
}
}
