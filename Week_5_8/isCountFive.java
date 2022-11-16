//package Java_Code.Week_5_8;

public class isCountFive {

    public static int isFive(int n)
    {
        int count = 0;
        while ( n > 0)
        {
            if(n % 10 == 5) // n has 5 on the last digit
            {
                count += 1; 
            }
            n /= 10; 
        }
        return count; 
    }
    

    public static void main(String[] main)
    {
        StdOut.print("Write a number of interger: ");
        int number = StdIn.readInt();
        int isFivenumber = isFive(number);
        StdOut.println(number + " has " + isFivenumber + " five(s)");
    }
}
 