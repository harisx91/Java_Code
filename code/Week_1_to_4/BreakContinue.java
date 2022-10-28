public class BreakContinue {

    public static void main(String[] args){

        for (int i = 1; i <= 5; i++){ //outer loop
            
            for (int j = 1; j <=3; j++){ //innerloop


                if (j == 2){
                    continue;
                }
            
                System.out.println(i + " " + j);
            
            }
            
        }
        System.out.println("Line after the loop");
    }
    
}
