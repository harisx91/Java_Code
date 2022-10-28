public class DisplayEvenNumber {

    public static void main(String[] args)

    {
        int number = 1;

        while (number < 100){ //boolean expression
            //while loop's body is executed every time the boolean expression is true
         
           if (number % 2 == 0) {
            //number is even
            System.out.print(number + " ");
         }   

         number += 1;
         

        
        System.out.println();


    }
    
}

}