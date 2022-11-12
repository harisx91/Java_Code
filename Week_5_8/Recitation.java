//package Java_Code.Week_5_8;
public class Recitation {
    public static void main(String[] args){

    
    int n = 3;
        
        if (n < 1) {
            return false;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        return true; 


        public static void main(String[] args)
        {
            int i = 1;
          if (val.length != 0)
              i = val[0];
          if (i == 11) // base case
              return;
          System.out.println(n + " * " + i + " = " + n * i);
          i++; // increment i
          print_table(n, i);
        }
   
      public static void main(String[] args)
      {
          int n = 5;
          print_table(n);
      }




  }
    }

    //public static void main(String[] args)

    public static boolean isAnagram(String string1, String string2) 
    {
        if (string1.length() != string2.length()) {
            return false;
        }

        char[] letter_1 = string1.toCharArray();
        char[] letter_2 = string2.toCharArray();
        Arrays.sort(letter_1);
        Arrays.sort(letter_2);
        return Arrays.equals(letter_1, letter_2);
    }