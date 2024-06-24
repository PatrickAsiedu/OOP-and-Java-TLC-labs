package mycollections;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;


public class MyArrayList {
    private List<Integer> mylist = new ArrayList<>();


    private  final int size = 6;
    private final int min = 1;
    private final int max = 49;

    public MyArrayList() {
    generateUniqueList();
    }

    private void generateUniqueList() {
        int number;
//

        for (int i=0; i<size;i++){

            do {
                number = (int) (Math.random() * (max )) + min;
            } while (contains(number, i));

            mylist.add(i,number) ;


        }
        Collections.sort(mylist);



    }

    private boolean contains(int number, int uptoIndex) {
        for (int i = 0; i < uptoIndex; i++) {
            if (mylist.get(i) == number) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return mylist.toString();
    }
}
