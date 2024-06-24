package mycollections;

import java.util.*;

public class MyHashSet {
    private Set<Integer> mySet = new TreeSet<>();
    private List<Integer> myList = new ArrayList<>();


    private  final int size = 6;
    private final int min = 1;
    private final int max = 49;

    public MyHashSet() {
        generateUniqueList();

    }

    private void generateUniqueList() {
        int number;
//

        for (int i=0; i<size;i++){


            number = (int) (Math.random() * (max )) + min;

            mySet.add(number);

        }





    }


    @Override
    public String toString() {
        return mySet.toString();
    }
}
