public class FiveperLine {


    public static void main(String[] args)
    
    {

        int PER_LINE = 5;

        for(int i = 1000; i <=2000; i++)
        {
            System.out.print(i + " ");

            if((i + 1 ) % PER_LINE == 0) System.out.println();

        }
        System.out.println();
    }
    
}
