public class SumOftwoSine {

    public static void main(String[] args){

        //take a double command line arguement t
        double degree = Double.parseDouble(args[0]);

        double radian = Math.toRadians(degree);

        double sum = Math.sin(2 *radian) + Math.sin(3 * radian);


        System.out.println(sum);

    }
    
}
