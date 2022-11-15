//package Java_Code.Week_5_8;

public class ArbitrarySizeInput {

    public static void main(String[] main)
    {
        //Explain and implement an end-of-file sequence to end user input.

        //ctrl + d

        while(!StdIn.isEmpty())
        {
            int value = StdIn.readInt();
            System.out.println(" Entered values " + value);

        }
        System.out.println("The end of input stream");

    }
    
}
