import javax.sql.rowset.serial.SerialStruct;

//package Java_Code.Week_5_8;

public class ClassOccupation {

public static void main(String[] args)
{

    //create the 2D array to hold weird classroom
    //row index 0 has 3 seats
    //row index 1 has 4 seats
    //row index 2 has 2 seats
    //row index 3 has 3 seats


    boolean[][] classroom = new boolean[4][];
    classroom[0] = new boolean[3];
    classroom[1] = new boolean[4];
    classroom[2] = new boolean[2];
    classroom[3] = new boolean[3];
     //pipolate the 2D array to determine the number of occupants
     for(int r=0; r < classroom.length; r++)
     {

        for(int c = 0; c < classroom[r].length; c++)
        {
            double value = Math.random();
            if (value < 0.5) 
            {
                classroom[r][c] = true; //seat is occupied
            }
            else{
                classroom[r][c] = false; //seat is not occupied
            }
        }

     }

     //traverse the entire 2D array to determine the number of occupants
     int totalOccupants = 0;
     for( int r = 0; r <classroom.length; r++)
      {
     for ( int c = 0; c < classroom[r].length; c++)
     {
        if (classroom[r][c] == true)
        {
            totalOccupants += 1;
        }
     }
        
     }
     System.out.println("Number of occupants: " + totalOccupants);

     ////traverse only row index 2 to determine the number of occupants
     int row2Occupants = 0;
     for(int c = 0; c < classroom[2].length; c++)
     {
        if(classroom[2][c] == true)
        {
            row2Occupants += 1;
        }
     }
     System.out.println("Number of occupants in row 2: " + row2Occupants);

     //traverse only column index 3 (fourth column) to determine the number of occupants
     int col3Occupants = 0 ;
     for(int r = 0; r < classroom.length; r++)
     {
        if(classroom[r].length > 3)
        {
            if(classroom[r][3] == true)
            {
                col3Occupants +=1;
            }
        }
     }
     System.out.println("Number of occu[ants in col index 3: " + col3Occupants);


}    
    
}
