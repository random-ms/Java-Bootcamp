import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(25, 19, 23, 45, 38, 23, 59, 12);

        integers.sort((right, left) -> right.compareTo(left)); //Ascending order
        // integers.sort((right, left) -> left.compareTo(right)); Descending order
        integers.forEach(i -> System.out.print(i + " "));
    }
}

/**************IMPERATIVE APPROACH**************
 * 
        for (int i = 0; i < integers.size(); i++) {
            for (int j = i + 1; j < integers.size(); j++) {
                if (integers.get(i).compareTo(integers.get(j)) > 0) {
                    int temp = integers.get(i);
                    integers.set(i, integers.get(j));
                    integers.set(j, temp);
                }
            }
        }
 */