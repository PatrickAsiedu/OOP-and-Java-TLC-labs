package fucntionaljava;
import java.util.List;

@FunctionalInterface
public interface Zip {
    List<Tuple<String,String>> zip(List<String> list1 , List<String> list2);


}
