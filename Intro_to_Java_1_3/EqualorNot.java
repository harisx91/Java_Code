public class EqualorNot {

    public static void main(String[] args){

        int n_0 = Integer.parseInt(args[0]);
        int n_1 = Integer.parseInt(args[1]);
        int n_2 = Integer.parseInt(args[2]);

        if (n_0 == n_1 && n_1 == n_2)
        {

            System.out.println("Equal");
        }
        else
        {
            
            System.out.println("Not Equal");
        }
        

    }
    
}
