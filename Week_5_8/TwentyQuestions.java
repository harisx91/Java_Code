//package Java_Code.Week_5_8;

public class TwentyQuestions {


public static void main(String[] args)
{

    //  generate a number and answer questions
    //while the user tries tp guess the value
    int secret = 1 + (int)(Math.random() * 100);
    StdOut.print("I am thinking of a number ");
    StdOut.println("between 1 and 1,000,000");

    int guess = 0;
    while (guess != secret)
    {
        StdOut.print("What is your next guess? ");
        guess = StdIn.readInt();
        if(guess == secret) StdOut.println("You win!");
        if(guess < secret) StdOut.println("Too Low");
        if(guess > secret) StdOut.println("Guess is too HIGH");

    }
    
}
    
}
