//package Java_Code.Week_5_8;

public class Cube {

    
    
    //itentify the scope of variable in a program with mutiple methods and method calls
    public static int cube(int i)
    {
        i = i * i * i;
        return i;

    }
    
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        for(int i = 1; i <= n; i++)
        {
            StdOut.println(i + " " + cube(i) );
        }
    }

    
    
}
