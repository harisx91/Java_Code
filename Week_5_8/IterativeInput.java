import javax.sound.sampled.LineEvent;

//package Java_Code.Week_5_8;

public class IterativeInput {

    public static void main(String[] args)
    {
        //Use the following methods of StdIn in programs to read individual tokens from 
        //standard input: isEmpty(), readInt(), readDouble(), readBoolean(), readString()
        /*int n = Integer.parseInt(args[0]);
        while (n > 0)
        {
        //while (StdIn.isEmpty())
        System.out.println("Enter an interger: ");
        int number = StdIn.readInt(); //read an integer from the standard input
        System.out.println(" The user entered " + number);
        n -= 1;
        

    }*/
    //read as many double as the user desires using StdIn.isEmpty
   /*  System.out.println("Reading doubles");
    int count = 0;
    while(!StdIn.isEmpty()) 
    {
        double value = StdIn.readDouble();
        count += 1;
        System.out.println(value);
    }
    System.out.println("User entered" + count + " doubles");
    */

    //read one boolean
    /*System.out.println("Please, enter a boolean :");
    boolean boolValue = StdIn.readBoolean();
    System.out.println("User entered : " + boolValue);
    */

    //read on string
    /*System.out.println("Please, enter a string: ");
    String value = StdIn.readString();
    System.out.println(" User entered :" + value);
    */
    
    //Use the followung methods of StdIn in programs for reading characters
    
    /*while(StdIn.hasNextChar())
    {
        char c = StdIn.readChar();
        System.out.println("The character entered is: " + c) ;
    }
    */

    //use the following methods of StdIn in programs for reading lines from standard
    //input: hasNextLine(), readLine(), readAll()
    /*while(StdIn.hasNextLine())
    {
        String line = StdIn.readLine();
        System.out.println(line);
    }
    */

    //Use the following methods of StdIn in programs for reading from standard input 
    //to arrays:readAllInts(), readAllDoubles(), readAllBooleans(), readAllStrings(), readAllLines()

    /*int[] array = StdIn.readAllInts();

    System.out.println("All vaues are read");
    for(int i = 0; i < array.length; i++)
    {
        System.out.println(i+ " " + array[i]);
    }
    */

    /*double[] doublearray = StdIn.readAllDoubles();

    System.out.println("All values are read as:");
    for(int i = 0; i < doublearray.length; i++)
    {
        System.out.println(i + "-" + doublearray[i]);

    }*/

    //readAllBooleans(), 
    boolean[] boolarray = StdIn.readBoolean();
    
    System.out.println("Reading boolean values as:");
    for(int i = 0; i < boolarray.length; i++)
    {
        System.out.println(i + "-" + boolarray[i]);

    }
    
    //readAllStrings(), 
    
    //readAllLines()


    
}
}
