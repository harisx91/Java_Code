import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

//package Intro_to_Java_1_2;
public class ContinuouslyCompoundedInterest {

    public static void main(String[] args){

        //taking the input for amount of money invested
        double invested = Double.parseDouble(args[0]);

        //taking the input for how many years
        double years= Double.parseDouble(args[1]);
        
        //taking the inout for interest rate
        double interest_rate = Double.parseDouble(args[2]);

       

        //double rate_years = interest_rate * years;
        double rt = (interest_rate/100) * years;

        double Principal = invested * Math.pow(Math.exp(1), rt);




        //prints money after t years
        System.out.println("You will have: "+ Principal + " after " + years + 
                            " years, at the interest rate of " + interest_rate + "%");

    }
    
}
