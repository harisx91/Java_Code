public class Sum {

    public static void main(String [] args){

        int n = Integer.parseInt(args[0]);

        int sum = 0;

       for(int i = 1; i <= n; i++)
       {
        //while(n > 0){
            sum += i; //same as sum = sum + n
            // 1 1
            // 2 3
            // 3 6
            // 4 10
            // 5 15
            //n -= 1 ; //same a n = n - 1

        }
        System.out.println("Sum of 1 up to and including " + n +" is " + sum);
    }
    
}

