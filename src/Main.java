import fucntionaljava.Tuple;
import fucntionaljava.Zip;
import mycollections.MyArrayList;
import mycollections.MyHashSet;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        IntArray arr = new IntArray(5);
//        int[] array= arr.getMyArray();
//        for (int i: array){
//            System.out.println(i);
//        }

//        Trade mytrade = new Trade("T1", "AAPL", 100 ,10);
//        System.out.println(mytrade);

//        System.out.println(LocalTime.now());

//        CustomArray array = new CustomArray();
//        System.out.println(array);
//        MyArrayList list = new MyArrayList();
//        System.out.println(list);

        MyHashSet set = new MyHashSet();
        System.out.println(set);

        Zip zipFunc = (list1, list2)->{
            List<Tuple<String,String>> zippedList = new ArrayList<>();
            for (int i =0; i<list1.size();i++){
                zippedList.add(new Tuple<>(list1.get(i) ,list2.get(i)));
            }
            return zippedList;
        };

        List<String> list1 = List.of("a","b","c");
        List<String> list2 = List.of("1","2","3");

        List<Tuple<String,String>> result = zipFunc.zip(list1,list2);
        System.out.println(result);






        }

}