public class RandomNumbers {

    public static void main(String[] args){

        int n = 5;

        double x1 = Math.random();
        double x2 = Math.random();
        double x3 = Math.random();
        double x4 = Math.random();
        double x5 = Math.random();

        double avg = ((x1 + x2 + x3 + x4 + x5)/5);
        double min = Math.min(x1, Math.min(x2, Math.min(x3, Math.min(x4, x5))));
        double max = Math.max(x1, Math.max(x2, Math.max(x3, Math.max(x4, x5))));

        System.out.println("The average is: " + avg);
        System.out.println("The minnimum is: " + min);
        System.out.println("The maximum is: " + max);

    }
    
}
