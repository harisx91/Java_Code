//package Java_Code.Week_5_8;

public class CouponCollector {

    public static int getCoupon(int n)
    {
        return (int) (Math.random() * n);
    }
    

    public static int collect(int n)
    {
        boolean[] isCollected = new boolean[n];
        int count = 0;
        int distint = 0;
        
        while (distint < n)
        {
            //Generate another coupon
            int value = getCoupon(n);
            count++;
            if(!isCollected[value])
            {
                distint++;
                isCollected[value] = true;
            }
        }
        return count;
    }
    
    public static void main(String[] args)
    {
        //takes the command line arguement n
        //random integers between 0 and n-1 (int)(Math.random() * n)

        int n = Integer.parseInt(args[0]);
        int count = collect(n);
        

        System.out.println(count);

    }
    
}