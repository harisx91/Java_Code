//package Intro_to_Java_1_4;

public class Cards {

    public static void main(String[] args)
    {

        String[] SUITS= {"Clubs","Diamonds", "Hearts", "Spades"};
        String[] RANKS= {"2","3","4","5","6","7","8","9","10",
                        "Jack","Queens","King","Ace"};

        //int i = (int) (Math.random() * SUITS.length);
        //int j = (int) (Math.random() * RANKS.length);
        
        //

        String[] deck = new String[RANKS.length * SUITS.length];

        for (int i = 0; i < RANKS.length; i++)
            for(int j = 0; j < SUITS.length; j++)
                deck[SUITS.length * i + j] = RANKS[i] + " of " + SUITS[j];
                System.out.println(deck[50]);

        int n = deck.length;
        for(int i = 0; i < 0; i++)
            {
                int r = i + (int) (Math.random() * (n-i));
                String temp = deck[i];
                deck[i] = deck[r];
                deck[r] = temp;


            }
    }
}
