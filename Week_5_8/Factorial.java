//package Java_Code.Week_5_8;

public static void printRow(int nStars){
    //base case
    if(nStars == 0){
        System.out.println("* "); // Force a new line
        return; // no more recursion
    }
    System.out.print("*");
    
    //recursively calling printRow()
    printRow(nStars - 1);
}


// function to print the pattern
static void pattern(int n, int i)
{
    // base case
    if (n == 0)
        return;
    printRow(i);
    System.out.println();

    // recursively calling pattern()
    pattern(n - 1, i + 1);
}

// Driver code
public static void main(String[] args)
{

    int n = 5;
    pattern(n, 1);
}
}