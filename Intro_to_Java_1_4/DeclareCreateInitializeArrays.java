
public class DeclareCreateInitializeArrays {

    public static void main(String[] args)
    {
        //Declare,
        //create, and 
        //initialize one-dimensional(1D) and two-dimensional (2D) arrays.

        //[] array of integers
        int[] samples; //declaration of samples which is a reference to an array of integers

        samples = new int[200]; //create the array with 200 integers, Java initializes to all 0s

        samples[0] = 345; //assigning the value 345 to first position of the array

        int[] samples2 = {7, 902, 3, 12, 42};


        //spreadsheet is the name of the variable that is reference to a 2D array
        double[][] spreadsheet = new double[5][7];

        for(int r =0; r < spreadsheet.length; r++)
        {
            for(int c=0; c < spreadsheet[0].length; c++)
            {
                spreadsheet[r][c] = Math.random();
            }
        }

        System.out.println(spreadsheet[4][3]);

        int[] b = {1 ,2, 3, 4};

        for (int j = 0; j < b.length; j++) System.out.println(b[j]);


        int[] array;
        array = new int[5];

    }

    }

