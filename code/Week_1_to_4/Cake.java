public class Cake {

    public static void main(String[] args){

        
        int CakeSize = Integer.parseInt(args[0]);
        int price = 0;

        if (CakeSize <= 0){
            System.out.println("Error");
        }
        else{
            if(CakeSize <= 5){ 
                price = 10;
            }
            else {
                if (CakeSize >=6 && CakeSize <=12){
                    price = 15;

                }
                else{
                    price = 20;
                }
            }
            System.out.println("Cake price is " + price);
        }
        
    }
    
}
