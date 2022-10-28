
 // entry point of the programin java has to be inside a class
public class Pay {
   // entry point of the program: interpreter looks for the main method and starts
   // the execution of the program right here
   public static void main (String[] args) {

    //comand line inputs come inside the program through args
    //args[0] is the first arguement
    //args[1] if the second arguement

    //declare a variable of type double that store real numbers
    double hoursWorked = Double.parseDouble(args[0]); 
    double wage = Double.parseDouble(args[1]);

    if (hoursWorked <0 || wage < 0 ) {
        System.out.println("Error");
    } else {
        double totalPay = hoursWorked * wage;
        System.out.println("Total pay is "+ totalPay);
    }
   }

}
