//package Week_5_8;

public class PopulationAge {

    public static void main(String[] args){
        int nbrPeople = Integer.parseInt(args[0]);
        //StdOut.print("How many people in you ton? ");
        //int nbrPeople = StdIn.readInt();

        //generate nbrPeople age between 0 - 120 years old
        for (int i = 0; i < nbrPeople; i++){
            StdOut.println((int)(Math.random() * 121) );

        }

    }
    
}
