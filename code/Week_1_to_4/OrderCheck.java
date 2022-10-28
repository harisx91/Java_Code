public class OrderCheck {

    public static void main(String[] args) {
        if (args.length == 4) {
            int w = Integer.parseInt(args[0]);
            int x = Integer.parseInt(args[1]);
            int y = Integer.parseInt(args[2]);
            int z = Integer.parseInt(args[3]);

            boolean result = (w < x && x < y && y < z) || (w > x && x > y && y > z);

            System.out.println(result);
        } else {
            System.out.println("Please enter four integers as command line arguments");
        }
    }
    
}
