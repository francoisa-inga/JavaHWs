package ArraysExercises;

public class ArrayRunner {
    public static void main(String[] args) {
        //Create and initialize array
        ArrayRepeatedNumbersV1Arraylist arrayMain = new ArrayRepeatedNumbersV1Arraylist();
        int[] numbersMainArray = {1,1,1,4,5,5,7,8,9,5};

        /** Temporarily disabled, under debugging (another variant of Task displaying the duplicated elements)
        int[] numbersMainArray = {0,0,7,5,5,7,9,9};
        ArrayRepeatedNumbersV2Array arrayMainArray = new ArrayRepeatedNumbersV2Array();
         */

        //Calculate repeated elements
       // arrayMain.displayRepeatedElements(numbersMainArray);
        arrayMain.displayRepeatedElements(numbersMainArray);

        //Display array in revert order
        ArrayReverseOrder arrayReversedOrders = new ArrayReverseOrder();
        arrayReversedOrders.displayReverseArray(numbersMainArray);

        //Print reverted array
        for(int i=0;i<numbersMainArray.length;i++){
            System.out.println("numbersMainArray ["+i+"] ="+numbersMainArray [i]);
        }


    }
}
