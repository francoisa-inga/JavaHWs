package ArraysExercises;

public class ArrayRepeatedNumbers {

    public void displayRepeatedElements(int[] numbers){
        int i,j;

        //Create and initialize array where the number of repeats are to be store for each element
        int [] numbersStore = new int[numbers.length];
        for(i=0;i<numbersStore.length;i++) {
            numbersStore[i] = 1;
        }

        // Comparison of elements, searching for repeats
        for(i=0;i< numbers.length;i++) {
            for (j = i + 1; j < numbers.length; j++) {
                if ((numbers[i] == numbers[j]) && (numbersStore[j] != -1)) {
                    numbersStore[i]++;
                    numbersStore[j] = -1;
                }
            }
        }

            // Print repeated elements
            for (i = 0; i < numbersStore.length; i++) {
                if (numbersStore[i] > 1) {
                    System.out.println("The element [" + i + "] =" + numbers[i] + ", repeated " + numbersStore[i] + " times");
                }
            }
 //       }
    }
}
