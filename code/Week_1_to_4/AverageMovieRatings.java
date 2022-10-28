public class AverageMovieRatings {

    public static void main(String[] args)

    {
        // args stores command line arguement
        //args.length stores the number of arguments in the command line

        int nbrFriends  = args.length; // nbr of people that went to the movies
        int sum = 0;

        int i = 0; //this is the index on args

        while ( i < nbrFriends) {
            int rating = Integer.parseInt(args[i]);
            sum = sum + rating; //sum += rating;
            i = i +1; //i++ or i +=1

        }
          //an integer divided by an integer results in an integer
          //make the numerator a double by multiplying it bby 1.0 and then divide
        double avg = (sum  * 1.0) / nbrFriends;

        double avg2 = ((double)sum)/ nbrFriends;

        System.out.println("The movie's rating average is "+ avg);
        System.out.println("The movie's rating average is "+ avg2);

      
    }
    
}
