public class EvenNumbers {

    public static void main(String[] args){

        int n = Integer.parseInt(args[0]);

        int i = 1;

        while(i <=n){
    //for ( int i = 1; i <=n; i++){

        if (i % 2 == 0){
            System.out.println(i + " is even");
        }
        i += 1; // same as i = i + 1 OR i++
    }
    }
    
}
