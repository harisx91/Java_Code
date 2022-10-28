public class DisplayDigits{

    public static void main(String[] args)
    {

        int number = Integer.parseInt(args[0]);

        for ( ; number > 0; number = number / 10 ){
            //while (number > 0)
            int digit = number % 10;
            System.out.print(digit + " ");
            number = number /10; //number /=10;

        }
        System.out.println();
        

    }
}