//package Intro_to_Java_1_4;

public class ShiftLeft {

    public static void main(String[] args)
    {

    //declare an array
    //int[] array;
    
    //create an array
    int[] array = {1 ,2, 3, 4, 5};

    //1 ,2,3,4,5
    //5,4,3,2,1

    //traverse an array
    for (int i = 0; i < array.length; i++ )
    {
        System.out.print(array[i] + " ");
    }
    System.out.println();

    int firstItem = array[0]; //save first item
    //shift all items left

    for (int i = 0; i < array.length-1; i++ )
    {
        array[i] = array[i+1];

    }
    //2,3,4,5,5
    array[array.length-1] = firstItem; //store the first item of the array at the last index

    for(int i=0; i<array.length; i++)
    {
        System.out.print(array[i] + " ");
    }
    System.out.println();

    //traversing reverse order
    for(int i = array.length-1; i >= 0; i--)
    {
        System.out.print(array[i] + " ");
    }
    System.out.println();
//takes the command line arguement n
//random integers between 0 and n-1 (int)(Math.random() * n)

//MIN and MAX in an array
int max = Integer.MIN_VALUE;
int min = Integer.MAX_VALUE;
for(int i = 0; i < array.length; i++)
{
    if(array[i] > max)
    max = array[i];

    if(array[i] < min)
    min = array[i];
}
System.out.println(min);
System.out.println(max);


}
}
