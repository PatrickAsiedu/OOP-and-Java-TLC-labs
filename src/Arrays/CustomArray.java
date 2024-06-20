package Arrays;

public class CustomArray {
    int [] myarray  =  new int [6];
    

    private  final int size = 6;
    private final int min = 1;
    private final int max = 49;

    public CustomArray() {
        myarray = new int[size];
        generateUniqueArray();
    }

    private void generateUniqueArray() {
        for (int i = 0; i < size; i++) {
            int number;
            do {
                number = (int) (Math.random() * (max )) + min;
            } while (contains(number, i));
            myarray[i] = number;
        }
    }

    private boolean contains(int number, int uptoIndex) {
        for (int i = 0; i < uptoIndex; i++) {
            if (myarray[i] == number) {
                return true;
            }
        }
        return false;
    }

    public int[] getArray() {
        return myarray;
    }


}


