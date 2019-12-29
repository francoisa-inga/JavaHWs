package ArraysExercises;

public class ArrayRunner {
    public static void main(String[] args) {

        //Declare an array where we'll calculate repeated elements
        int[] numbersMainArray = {1,1,1,3,5,5,8,5};

        //Create and initialize array for Variant#1 (via ArrayList)
        ArrayRepeatedNumbersV1Arraylist arrayMain = new ArrayRepeatedNumbersV1Arraylist();
        arrayMain.displayRepeatedElements(numbersMainArray);

        //Create an array for Variant#2 (via simple Array)
        ArrayRepeatedNumbersV2Array arrayMainArray = new ArrayRepeatedNumbersV2Array();
        arrayMainArray.displayRepeatedElements(numbersMainArray);


        //Calculate repeated elements
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
