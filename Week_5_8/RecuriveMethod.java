import javax.management.ValueExp;

//package Java_Code.Week_5_8;

public class RecuriveMethod {

    public static int isFive(int n)
    {
        int count = 0;
        while ( n > 0)
        {
            if(n % 10 == 5) // n has 5 on the last digit
            {
                count += 1; 
            }
            n /= 10; 
        }
        return count; 
    }

    //Recursive count five
    public static int rCountFive(int n)
    {
        //base case = 0
        if(n == 0)
        {
            return 0;

        }
        int count = 0;
        if(n % 10  == 5)
        {
            count = 1;
        }
        return count + rCountFive(n/10);

    }

    public static boolean findValue(int[] a, int v, int bIndex)
    {   
       //base case
        if(bIndex == a.length)
        {
            return false; //v jas ot been found in the entire array
        }
        else if (a[bIndex] == v)
        {

            return true; //v has been found
        }
        //recursive case
        return findValue(a, v, bIndex + 1);
    }
    

    public static void main(String[] main)
    {
        int[] array = { 65, 635, 13, 55, 2, 7 , 88, 231};
        boolean found = findValue(array, 2, 0);
        StdOut.println(found);
        System.out.println(Math.pow(5/2, 2));


    }
    
}

