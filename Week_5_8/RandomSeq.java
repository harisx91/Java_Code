public class RandomSeq{

    public static void main(String[] args)
    {
        //Redirect standard output to a file when executing a program ( java RandomSeq > randomguesses.txt)
        // Redirect from a file to standard input when executing a program. ( java RandomSeq < userguesses)

        //generate a number between 1 and 100000
        int secret = 1 + (int)(Math.random() * 100000);

        //the user has 5 tries to guess the correct number
        StdOut.println("The user has 5 tries to think for a number between 1 and 100000 ");
        
        int tries = 0; //used to stored the tried that user has already guessed
        int guess = 0; //used to store the user guess


        while(tries < 5)
        {
            StdOut.println("What is your next guess? ");
            guess = StdIn.readInt();
            tries += 1; 

            if(guess == secret)
            {
                StdOut.println("You win!");
                break;
            }
            else if (guess < secret)
                {
                    StdOut.println("Too Low");
                }
            
                else
                {
                    StdOut.println("Too High!");
                }
            }
            StdOut.println("The user had " + guess + " guesses to get the right number");
        
        }  

    }