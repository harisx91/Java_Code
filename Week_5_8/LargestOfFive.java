/*************************************************************************
 *  Compilation:  javac LargestOfFive.java
 *  Execution:    java LargestOfFive 35 10 32 1 8
 *
 *  @author: Name: Haris Sumra, netID: hs920
 *
 *  Takes five distinct integers as command-line arguments and prints the 
 *  largest value
 *
 *
 *  % java LargestOfFive 35 10 32 1 8
 *  35
 *
 *  Assume the inputs are 5 distinct integers.
 *  Print only the largest value, nothing else.
 *
 *************************************************************************/


    //Define the class.
public class LargestOfFive {

    //Define the main method.
    public static void main(String args[]) {
    
    //Store the first number as largest.
    int largest = Integer.parseInt(args[0]);
    
    //Iterate through the inputs.
    for(int i=1;i<args.length;i++)
    {
    //Compare the input with largest
    //Update the largest.
    if(largest<Integer.parseInt(args[i]))
    largest = Integer.parseInt(args[i]);
    }
    //Display the results.
    System.out.println(largest);
    }
    }