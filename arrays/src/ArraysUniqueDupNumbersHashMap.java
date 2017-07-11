/*
     Given two integers, find duplicate and unique numbers from both arrays.
     And no need to maintain the order of numbers while displaying the output.

     Used a Hashmap to store the number as a key and its count as value.

     Current code is slightly edited version, originally from
     https://stackoverflow.com/questions/29738161/java-find-duplicate-and-unique-integers-from-two-arrays/29740800#29740800
 */


import java.util.*;


class ArraysUniqueDupNumbersHashMap {

    private static Set<Map.Entry<Integer, Integer>> findDup(int [] a, int [] b) {
        HashMap<Integer, Integer> entries = new HashMap<>();

        for (Integer i:a)
            entries.put(i, entries.get(i) == null ? 1 : entries.get(i) + 1);

        for (Integer i:b)
            entries.put(i, entries.get(i) == null ? 1 : entries.get(i) + 1);


        return entries.entrySet();
    }


    public static void main(String args[]) {
        int[] array1 = {18,2,5,1,7,2,4};
        int[] array2 = {18,1,44,1,22,124,1,21};

        for (Map.Entry<Integer, Integer> entry: findDup(array1, array2)) {
            if (entry.getValue() > 1)
                System.out.println("duplicate: " + entry.getKey() + " (count = " + entry.getValue() + ")");
            else
                System.out.println("unique: " + entry.getKey() );

        }
    }
}