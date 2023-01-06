import java.util.Arrays;
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
//        int[] numbers = new int[10];
//        Arrays.fill(numbers, 10);
//        System.out.println(Arrays.toString(numbers));
        int[] numbers = {10,20,30,40,50};
        int[] ints = Arrays.copyOf(numbers, 4);
        int[] ints1 = Arrays.copyOfRange(numbers, 1, 3);
//        System.arraycopy();
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(ints1));


        LinkedList<String> abc = new LinkedList<>();





    }
}
