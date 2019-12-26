package ArraysExercises;

import java.util.ArrayList;

public class ArrayRepeatedNumbersV1Arraylist {

    public void displayRepeatedElements(int[] numbers){
        int i,j;

        //Create and initialize array where the number of repeats are to be store for each element
        int [] numbersStore = new int[numbers.length];
        for(i=0;i<numbersStore.length;i++) {
            numbersStore[i] = 1;
        }

        //Create an ArrayList to store the repeated elements
        ArrayList<Integer>resultRepeatedArray = new ArrayList<Integer>();

        // Comparison of elements, searching for repeats
        for(i=0;i< numbers.length;i++) {
            for (j = i + 1; j < numbers.length; j++) {
                if ((numbers[i] == numbers[j]) && (numbersStore[j] != -1)) {
                    numbersStore[i]++;
                    numbersStore[j] = -1;
                }
            }
        }

            // Fill Arraylist of repeated elements
            for (i = 0; i < numbersStore.length; i++) {
                if (numbersStore[i] > 1) {
                    resultRepeatedArray.add(numbers[i]);
                }
            }

        // Print repeated elements
                for(i=0;i<resultRepeatedArray.size();i++){
                    System.out.println("Element of the result array #"+i+" = "+resultRepeatedArray.get(i));
                }

 //       }
    }
}
