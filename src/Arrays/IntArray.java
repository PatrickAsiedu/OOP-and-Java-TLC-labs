package Arrays;

public class IntArray {
    private int [] myarray;

    public  IntArray (int size){

        myarray=new int [size];

        for ( int i=0; i < size ; i++){
            myarray[i]=i+1;
        }



    }

    public int[] getMyArray(){
        return myarray;
    }
}
