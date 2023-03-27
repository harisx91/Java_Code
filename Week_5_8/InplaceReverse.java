
public class InplaceReverse {
     
        public static void main(String[] args) {      
              
            //Initialize array   
            //int [] arr = new int [] {1, 2, 3, 4, 5};   
            int input_a = Integer.parseInt(args[]);
            

            //System.out.println("Original array: ");  
            for (int i = 0; i < input_a.length; i++) {   
                //System.out.print(input_a[i] + " ");   
            }    
              
            //System.out.println();  
              
            System.out.println("Array in reverse order: ");  
            //Loop through the array in reverse order  
            for (int i = input_a.length-1; i >= 0; i--) {   
                System.out.print(input_a[i] + " ");   
            }    
        }  
    } 
