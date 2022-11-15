import javax.xml.stream.events.StartDocument;

//package Java_Code.Week_5_8;

public class Average {

    public static void main(String[] args)
    {

        //average the number on standard input
        int sum = 0;
        int count = 0;
        while(!StdIn.isEmpty())
        {
            //read a number from standard input and add to sum
            //int value = StdIn.readInt();

            sum += StdIn.readInt();
            count++;

        }
        //int average = sum/n;
        StdOut.println("Average is " + sum/count);
        


    }
    
}
