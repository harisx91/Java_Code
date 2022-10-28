/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author: Name: Haris Sumra - netID: hs920
 *
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes {

    public static void main(String[] args) {

		// WRITE YOUR CODE HERE
        //Read reviewers count
        int reviewers = Integer.parseInt(args[0]);

        //Read movies count

        int movies = Integer.parseInt(args[1]);

        //Array to store ratings
        int ratings[][] = new int[reviewers][movies];
        int ind = 2;

        //Fill ratings
            for(int i=0;i<reviewers;i++){
            for(int j=0;j<movies;j++){
            ratings[i][j] = Integer.parseInt(args[ind++]);
            }
            }

            //Find the movie with the highest total rating
            int ans = 0,maxTotal=0;
            for(int j=0;j<movies;j++){
            int total = 0;
            for(int i=0;i<reviewers;i++){
            total += ratings[i][j];
            
            }

            if(total>maxTotal){
            maxTotal = total;
            ans = j;
                }
    
            }

            System.out.println(ans);

        }
    }
