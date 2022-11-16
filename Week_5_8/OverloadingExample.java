//package Java_Code.Week_5_8;

public class OverloadingExample {

//(7.1m) Trace and write programs involving overloading methods
//Overloading: Two or more methods with the same name but the signature of the method is not the same
//but the name of the method and return is the same

    public static int findMax(int[] array)
    {
        int max = array[0];
        for (int i = 1 ; i < array.length; i++)
        {
            if(max < array[i])
            {
                max = array[i];
            }
        } 
        return max;
    }
    
    public static int findMax(int[][] array)
    {
        int max = array[0][0];
        for(int r = 0; r < array.length; r++)
        {
            for(int c = 0; c < array[r].length; c++)
            {
                if(max < array[r][c] )
                {
                    max = array[r][c];
                }
            }
        }
        return max;
    }
    
    
    
    public static void main(String[] args)
    {
        int[] d1 = {18, 3, 198, 35, 3, 3875, 7, 984, 21};
        int[][] d2 = {{4,2,1,5},{45,12,12,5,847,34,56},{8,3,12,984,325,5}};
        
        StdOut.println("Max of 1D array: " + findMax(d1)); //matches the first function

        StdOut.println("Max of 2D arrray: " + (findMax(d2))); //matches the second function

    }
    
}
