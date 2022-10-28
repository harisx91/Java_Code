public class RollLoadedDie {

    public static void main(String[] args){

        /// sets the varible so taht it outputs values between 0.0 and 1.0
        double r = Math.random();

        int roll;
        if      (r < 1.0/8.0) roll = 1;
        else if (r < 2.0/8.0) roll = 2;
        else if (r < 3.0/8.0) roll = 3;
        else if (r < 4.0/8.0) roll = 4;
        else if (r < 5.0/8.0) roll = 5;
        else                   roll=6;


        System.out.println(roll);
        

    }
    
}
