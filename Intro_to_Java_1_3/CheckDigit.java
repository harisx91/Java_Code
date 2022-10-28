public class CheckDigit {

    public static void main(String[] args)
    {

        //Check digit  (30 points). Write a program CheckDigit.java that 
        //takes a 12 or 13-digit long as a command-line argument 
        //and displays the digit computed as follows:
       //Take for an example the number 048231312622
        //Sum every other digit of the code, starting from the right.  
        //In the example, that is 2 + 6 + 1 + 1 + 2 + 4 = 16.  Discard the tens digit and keep the ones digit, 6. 
        //Start with the second to last digit and do the same thing.  
        //Sum the digits, discard the tens digit and keep the ones digit.  
        //In this example this is 2 + 2 + 3 + 3 + 8 + 0=18. 
        // Discarding the 10 leaves 8.  Multiply this number by 3 and again discard the tens digit.  8×3 = 24, leaving 4.

//        Add the numbers from steps 1 and 2.  Again drop the tens digit.  6 + 4 = 10, leaving the digit 0 (zero).

//      Hint 1: the maximum value that can be stored in an integer variable is 2147483647 which is only 10 digits long. 
        //To read a 12 or 13-digit integer from command line argument you will need to store it in a long variable. 
        //Use: long number = Long.parseLong(args[0]); to read a long from the command line.

        //Hint 2: to extract the rightmost digit of a number use the modulus operator.

       //Hint 3: to remove the rightmost digit of a number use the integer division by 10
        //Hint 4: for full credit use a loop to compute the sums

        int sum1=0, sum2=0;

        long n = Long.parseLong(args[0]); //048231312622

        int count = 1;
        while( n > 0) //Loop to find sum of alternate digits
        { 
            if (count % 2 !=0) //Finding the sum of every other digit starting with the last digit
            sum1 += n % 10;
        
        else 
        sum2 += n % 10;
        // Removing the rightmost digit of the number because it has been added to one of the sums

        n /= 10;

        count++;

        }
        // Discarding the tens digit of both the sums

        sum1 %= 10;
        sum2 %= 10;

        // Multiplying the second number obtained by discarding the tens digit of the second sum by 3
        sum2 *= 3;

        // Again discarding the tens digit
        sum2 %= 10;

        // Adding both the numbers obtained
        int digit = sum1+sum2;

        // Again discarding the tens digit from the result
        digit %= 10;

        // Printing the result
        System.out.println(digit);
 


    }
    
}
