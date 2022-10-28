/*************************************************************************
 *  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker 10
 *
 *  @author: Name: Haris Sumra, netID: hs920
 *
 * The program RandomWalker that takes an int command-line argument n
 * and simulates the motion of a random walk for n steps. Print the
 * location at each step (including the starting point), treating the
 * starting point as the origin (0, 0). Also, print the square of the
 * final Euclidean distance from the origin.
 *
 *  % java RandomWalker 10
 * (0,0)
 * (-1,0)
 * (-1,-1)
 * (-1,-2)
 * (-1,-3)
 * (-1,-4)
 * (-1,-5)
 * (0,-5)
 * (-1,-5)
 * (-2,-5)
 * (-2,-4)
 * Squared distance = 20.0
 *
 *************************************************************************/

public class RandomWalker {

            public static void main(String[] args) {
            
            int randomNumber =0;
            
            double distanceBetweenPoints = 0.0;
            
            int posX =0, posY=0;
            
            int newPosX =posX;
            
            int newPosY =posY;
            
            //read the command line argument
            
            int number = Integer.parseInt(args[0]);
            
            int count =0;
            
            System.out.println("(" + newPosX + "," + newPosY + ")"); //print the origin point
            
            while(count < number)
            
            {
            
            //to get a number between 1 to 4
            
            randomNumber = (int)(System.currentTimeMillis()%(3*count+11));
            
            randomNumber = (randomNumber %4)+1;
            
            //if randomNumber is one then move east, 2- Move west, 3-Move north, else Move south
            
            if (randomNumber == 1)
            
            newPosX += 1;
            
            else if(randomNumber == 2)
            
            newPosX-=1;
            
            else if (randomNumber == 3)
            
            newPosY+=1;
            
            else
            
            newPosY-=1;
            
            //display the new point
            
            System.out.println("(" + newPosX + "," + newPosY + ")");
            
            count++;
            
            }
            
            //Euclidean Squared distance Between Points
            
            distanceBetweenPoints = (newPosX-posX)*(newPosX-posX) + (newPosY-posY)*(newPosY-posY);
            
            System.out.println("Squared distance = " + distanceBetweenPoints);
            
            }
            
            }
