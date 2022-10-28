public class SumOfTwoDice {

    public static void main(String[] args){

        //total sides of dice
        int SIDES = 6;

        //dice 1
        int a_1 = 1 + (int) (Math.random() * SIDES);
        int a_2 = 1 + (int) (Math.random() * SIDES);

        
        //sum
        int sum = a_1 + a_2;
        
        //output
        System.out.println("Sum of both are: " + sum);

    }
    
}
