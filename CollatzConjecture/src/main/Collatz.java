package main;

// class that contains the algorithm to count the steps in the collatz conjecture
public class Collatz {

     // EFFECTS: returns the number of steps it takes for i to reach 1 when the collatz conjecture is applied
     //          Throws Exception if i < 1.
     public static int counter(int i) throws Exception {
          if (i < 1) {
               throw new Exception();
          }

          int count = 0;
          int currentValue = i;
          while (currentValue > 1) {
               if (currentValue % 2 == 0) {
                    currentValue /= 2;
               } else {
                    currentValue *= 3;
                    currentValue += 1;
               }
               count++;
          }
          return count;}
}
