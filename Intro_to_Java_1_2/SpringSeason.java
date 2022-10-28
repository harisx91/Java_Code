public class SpringSeason {

    public static void main(String[] args)
    {
        //take two input day and month 
        int day_spring = Integer.parseInt(args[0]);
        int month_spring = Integer.parseInt(args[1]);

        boolean isSpring = (month_spring == 3 && day_spring >= 20 && day_spring <=30 ) 
                         || (month_spring == 4 && day_spring >=  1 && day_spring <= 30)
                          || (month_spring == 5 && day_spring >=  1 && day_spring <= 31)
                            || (month_spring == 6 && day_spring >=  1 && day_spring <= 20);


        System.out.println(isSpring);



    }
    
}
