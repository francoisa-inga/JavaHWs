package ArraysExercises;

import java.util.ArrayList;

public class ArrayRepeatedNumbersV2Array {

    public void displayRepeatedElements(int[] numbers){
        int i,j;
        int repEltsArrLength=0;

        //Create an array where the data from initial array numbers and number of repeats are to be store for each element
        int [][] numbersStore = new int[numbers.length][3];

        //initialize the new array
        for(i=0;i<numbersStore.length;i++) {
                numbersStore[i][0] = numbers[i];
                numbersStore[i][1] = 1;
                numbersStore[i][2] = 0;
        }

        // Comparison of elements, searching for repeats
        for(i=0;i< numbers.length;i++) {
            for (j = i + 1; j < numbers.length; j++) {
                if ((numbers[i] == numbers[j]) && (numbersStore[j][1] != -1)) {
                    numbersStore[i][1]++;
                    numbersStore[j][1] = -1;
                }
            }
        }

        // Calculate size of the final array with repeated elements
            for (i = 0; i < numbersStore.length; i++) {
                if (numbersStore[i][1] > 1){
                    repEltsArrLength++;
                }
                }

            //Create the result array of repeated elements and array of flags
            int [] resultArrayOfRepeatedElements = new int[repEltsArrLength];
            boolean [] resultFlags = new boolean[repEltsArrLength];

        //initializing the flags array
        for(i=0;i<resultFlags.length;i++){
            resultFlags[i]=false;
        }

        // filling the resulted array
        for(i=0;i<resultArrayOfRepeatedElements.length;i++) {
            //verify the repeated values and saving them in a new result array
            for (j = i; j < numbersStore.length; j++) {
                  if ((numbersStore[j][1] > 1) && (numbersStore[j][2] == 0) && (resultFlags[i] != true)) {
                    resultArrayOfRepeatedElements[i] = numbersStore[j][0];
                    numbersStore[j][2] = -1;
                    resultFlags[i] = true;
                }
            }
        }

        //print the final array
        System.out.println("The final array of repeated elements");
        for (i = 0; i < resultArrayOfRepeatedElements.length; i++) {
                System.out.println(resultArrayOfRepeatedElements[i]);
            }
     }
}
