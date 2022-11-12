import javax.lang.model.util.ElementScanner14;

//package Java_Code.Week_5_8;

public class Exercises_1_4 {

    public static void main(String[] args)
    {
        int[] a = new int[1000];

        int n = 1000;
        int[] b = new int[n*n*n];

        //System.out.println(b[0]);

        //2 vectors of length n one dimensional array
        //Euclidean distance (square root of the sum of the squares of the differences between)

        double[] x = new double[2];
        double[] y = new double[4];


    //two dimensinal boolean icludes rows and columns
    // using * to represent true
    // using "Space" to represent false

    boolean[][] array = {{ true ,false ,true},
                        {false, true ,false}};
    
        //int rows_length = array.length;
        //int columns_length = array[0].length;

        for(int r = 0; r < array.length; r++)
    {
        for(int c =0 ; c < array[0].length; c++)
        {
            if(array[r][c])
            {
                System.out.print(r + " * " );
            }
            else
            {
                System.out.print(" " + c);
            }
        }
        System.out.println();
    }

    int[] c = new int[10];
    for(int i = 0; i < 10; i++)
    c[i] = 9 - i;
    for(int i = 0; i < 10; i++)
    c[i] = c[c[i]];
    for(int i = 0; i < 10; i++)
    System.out.println(c[i]);

    System.out.println("---");

    int z = 10;
    int[] d= new int[z];
    d[0] = 1;
    d[1] = 1;
    for(int i = 2; i < z; i++)
    d[i] = d[i-1] + d[i-2];

    System.out.println(d[0]);
    System.out.println(d[1]);
    System.out.println(d[2]);
    System.out.println(d[3]);
    System.out.println(d[4]);
    System.out.println(d[5]);
    System.out.println(d[6]);
    System.out.println(d[7]);



    }

    
}
