package ArraysExercises;

public class ArrayReverseOrder {
    public void displayReverseArray(int[]arrayToRevert){

        int i,storeElement;
        int restDivide;

        //Calculate index of the mid of Array, must be int
        if(arrayToRevert.length%2==0){
            restDivide = arrayToRevert.length/2;
        }
        else {
            restDivide = arrayToRevert.length/2+arrayToRevert.length%2;
        }

            //Replacing array elements in reverse order
            for (i=0;i<restDivide;i++){
                storeElement=arrayToRevert[0+i];
                arrayToRevert[0+i] = arrayToRevert[arrayToRevert.length-1-i];
                arrayToRevert[arrayToRevert.length-1-i] = storeElement;
                }
            /**
            for (i=0;i<arrayToRevert.length;i++){
                System.out.println("Element ["+i+"] = "+arrayToRevert[i]);
            }*/

        }
}
