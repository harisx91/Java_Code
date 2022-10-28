public class AverageMovieRatingsForLoop {
    
    public static void main(String[] args)

    {
        // args stores command line arguement
        //args.length stores the number of arguments in the command line

        int nbrFriends  = args.length; // nbr of people that went to the movies
        int sum = 0;

       //i is the index on args
       //int i = 0; happens ONE time
       //i < nbrFriends happens before going into the loop
       // i  +=1 happens after all the loop's body operations have been executed

        for (int i = 0; i < nbrFriends ;  i ++ ) {
            //rating is only visible inside of the while loop
            int rating = Integer.parseInt(args[i]);
            sum = sum + rating; //sum += rating;
            i = i +1; //i++ or i +=1

        }
          //an integer divided by an integer results in an integer
          //make the numerator a double by multiplying it bby 1.0 and then divide
        double avg = (sum  * 1.0) / nbrFriends;

        // cast the numerator as a double and then divide
        double avg2 = ((double)sum)/ nbrFriends;

        System.out.println("The movie's rating average is "+ avg);
        System.out.println("The movie's rating average is "+ avg2);
      
    }
}
