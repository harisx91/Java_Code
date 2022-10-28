public class Gaussianrandom {

    public static void main(String[] args){

        double u = Math.random();

        double v = Math.random();

        double r = Math.sin(2 * Math.PI * v ) * (-2 * Math.log(u));


        System.out.println(r);

    }
    
}
