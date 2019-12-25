package ArraysExercises;

public class ArrayRunner {
    public static void main(String[] args) {
        //Create and initialize array
        ArrayRepeatedNumbers arrayMain = new ArrayRepeatedNumbers();
        int[] numbersMainArray = {1,1,1,4,5,5,7,8,9,5};

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
