public class ReverseInteger {

        public static void main(String[] args) {
            int n = Integer.parseInt(args[0]);        // original integer
    
            // reverse using arithmetic
            int m = 0;
            while (n != 0) {
                m = (10 * m) + (n % 10);
                n = n / 10;
            }
            System.out.println(m);

        // reverse again using string concatenation
        String s = "";
        while (m != 0) {
            int digit = m % 10;
            s = s + digit;
            m = m / 10;
        }
        System.out.println(s);


        //int x = Integer.parseInt(args[0]);
        int f = 0, g = 1;

        for (int i = 1; i <= 15; i++) {
            f = f + g;
            g = f - g;
            System.out.println(f);
        }
    }
}
    