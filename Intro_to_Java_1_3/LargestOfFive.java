public class LargestOfFive {

    public static void main(String[] args)
    {
        //Largest of five (20 points). Write an algorithm that read 5 
        //distinct integers and displays the largest value. 
        //Assume the input values are distinct integers.
        //java LargestOfFive 17 23 5 1 6
        //23

        //java LargestOfFive 8 3 -8 4 1
        //8

        int n_0 = Integer.parseInt(args[0]);
        int n_1 = Integer.parseInt(args[1]);
        int n_2 = Integer.parseInt(args[2]);
        int n_3 = Integer.parseInt(args[3]);
        int n_4 = Integer.parseInt(args[4]);

        int n = Math.max(n_0, Math.max(n_1, Math.max(n_2, Math.max(n_3, n_4))));

        System.out.println(n);

    }
    
}
