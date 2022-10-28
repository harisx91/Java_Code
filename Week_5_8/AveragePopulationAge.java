//package Week_5_8;

public class AveragePopulationAge {

    public static void main(String[] args){

        int sum = 0; //sum of all ages
        int count =0; //number of people

        while (!StdIn.isEmpty()){
            //there is something to read from Standard Input
            int age = StdIn.readInt();
            //sum += StdIn.readInt();
            sum += sum + age; // sum = sum + age
            count += 1; //count = count + 1

        }

        double avg = sum * 1.0 /count; //need to either cast sum to double or multiply by 1.0
        StdOut.println("Average" + avg);




    }
    
}
