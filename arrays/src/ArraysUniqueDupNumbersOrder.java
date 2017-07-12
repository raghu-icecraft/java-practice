/*
     Given two integers, find duplicate and unique numbers from both arrays.
     And maintain the order of numbers while displaying the output.

     Current code is slightly edited version, originally from
     https://stackoverflow.com/questions/29738161/java-find-duplicate-and-unique-integers-from-two-arrays/29738674#29738674
 */

import java.util.ArrayList;
import java.util.Arrays;


public class ArraysUniqueDupNumbersOrder {

    public static void main(String args[]) {

        //int[] array1 = {1,2,3,5};
        //int[] array2 = {1,3,7,6,8};

        int[] array1 = {18,2,5,1,7,2,4};
        int[] array2 = {18,1,44,1,22,124,1,21};

        ArrayList<Integer> unique = new ArrayList<>();
        ArrayList<Integer> dup = new ArrayList<>();

        // get the duplicate (common) numbers
        // get the unique numbers of array1 when compared to array2
        for(int i=0; i<array1.length; i++){
            boolean duplicate = false;
            for(int j=0; j<array2.length; j++){
                if(array1[i] == array2[j]){
                    dup.add(array1[i]);
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                unique.add(array1[i]);
            }
        }

        // Add the unique numbers of array2 when compared to array1
        // TODO: enhance the code a bit more. Execute the below code only when array2 length is more than
        // length of duplicate numbers of both arrays.
        for(int j=0; j<array2.length; j++){
            boolean duplicate = false;
            for(int i=0; i<array1.length; i++){
                if(array1[i] == array2[j]){
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                unique.add(array2[j]);
            }
        }

        System.out.println("Given two arrays: "+Arrays.toString(array1) + " and "+Arrays.toString(array2));
        System.out.println("Duplicates are: "+dup);
        System.out.println("Unique elements in the order from 2 arrays: "+unique);
    }

}
