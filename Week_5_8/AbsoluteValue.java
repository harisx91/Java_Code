//package Java_Code.Week_5_8;

public class AbsoluteValue {

    public static int absoulte(int n)
    {   
        if (n >= 0) 
        {
            return n; //n is positive
        }
        else
        {
            return n * -1; //n is negative
        }

    }

    
    
    public static void main(String[] args)
    {
        StdOut.print("Enter an integer value: ");

        int number = StdIn.readInt();

        StdOut.println("The absolute value of " + number + " is " + absoulte(number) );


    }
    
}
