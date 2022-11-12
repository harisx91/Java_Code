//package Java_Code.Intro_to_Java_1_4;

public class CouponCollector {

    public static void main(String[] args)
    {
        //takes the command line arguement n
        //random integers between 0 and n-1 (int)(Math.random() * n)

        int n = Integer.parseInt(args[0]);
        
        boolean[] isCollected = new boolean[n];
        int count = 0;
        int distint = 0;
        
        while (distint < n)
        {
            //Generate another coupon
            int r = (int) (Math.random() * n);
            count++;
            if(!isCollected[r])
            {
                distint++;
                isCollected[r] = true;
            }
        } //n distint coupon found

        System.out.println(count);

    }
    
}
