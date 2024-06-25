package fucntionaljava;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class StringOperation {


    public static BiFunction<Integer,Integer,Integer> getOperations(String operation){
        switch (operation.toLowerCase()){
            case "add":
                return Integer::sum;
            case "subtract":
                return (a,b)-> a-b;
            case "multiply":
                return (a,b)-> a*b;
            case "divide":
                return (a,b)-> a/b;


            default:
                throw new IllegalArgumentException("error");

        }
    }

//    public static Function<Integer,Function<Integer,Integer>> getOperation(String operation) {
//        switch (operation.toLowerCase()){
//            case "add":
//                return a->b-> a+b;
//
//            default:
//                throw new IllegalArgumentException("error");
//        }
//
//    }

    public static void main(String[] args) {

//        Function<Integer, Function<Integer, Integer>> addFunction = getOperation("add");
//        System.out.println("5 + 3 = " + addFunction.apply(5).apply(3));
        BiFunction<Integer,Integer,Integer> addFunction = getOperations("add");
        BiFunction<Integer,Integer,Integer> subFunction  = getOperations("subtract");
        BiFunction<Integer,Integer,Integer> mulFunction  = getOperations("multiply");
        BiFunction<Integer,Integer,Integer> divFunction  = getOperations("divide");
        System.out.println( addFunction.apply(5,3));
        System.out.println( subFunction.apply(5,3));
        System.out.println( mulFunction.apply(5,3));
        System.out.println( divFunction.apply(5,1));
//








    }
}
