public class RowColumnLoop {

    public static void main(String[] args)
    
    {

        int n = Integer.parseInt(args[0]);

        for (int r = 1; r <= n; r++ ){ //row loop; iterates through the row

            for(int c = 1; c <=n; c++){ //column loop; iterates through the column

                System.out.print( r + "," + c + " ");
            
        }
        System.out.println(); //prints new line
    }

}
}

    
