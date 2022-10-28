//package Intro_to_Java_1_3;

public class DivisorPattern {

    public static void main(String[] args){
        //printed a squre that visualizes divisor
        int n = Integer.parseInt(args[0]);
        
        for (int i = 1; i <= n; i++)
        {// print the ith line
            for (int j = 1; j <=n; j++)
            {
                //print the jth element in the line
                if ((i % j == 0) || (j % i == 0))
                System.out.print("* ");
                else 
                System.out.print("   ");

            }
            System.out.println(i);
        }

    }
    
}
