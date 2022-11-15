//package Java_Code.Week_5_8;

//main method is the entry point for java

public class CommandLine {

    //Use command line arguments to provide input values to programs.
    //(6.1b) Explain the meaning and functioning of String args[] as a parameter to main.
    //(6.1c) Explain the need for Integer.parseInt() and Double.parseDouble when using command line input.
    public static void main(String[] args)
    {
        for(int i = 0; i < args.length; i++)
        {
            System.out.println(args[i]); //args here are printed as string
        }
        int firstArg = Integer.parseInt(args[0]);
        System.out.println(args[0]); //printed as an integer

        double secondarg = Double.parseDouble(args[1]);
        System.out.println(args[1]);

        String thirdargs = args[2];
        System.out.println(thirdargs);

        char fourtharg = args[3].charAt(0); //grabbing the first character from string args
        System.out.println(fourtharg); 

    }
    
}
