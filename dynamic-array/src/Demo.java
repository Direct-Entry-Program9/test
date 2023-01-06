import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        var da1 = new DynamicArray();

        System.out.println(da1);    // []

        da1.add(10);
        da1.add(20);
        da1.add(30);

        System.out.println(da1); // [10,20,30]

        da1.remove(1);
        da1.remove(1);
        da1.remove(0);

        System.out.println(da1); // []

        da1.add(10);
        da1.add(20);
        da1.add(30);
        da1.add(40);
        da1.add(50);

        System.out.println(da1); // [10,20,30,40,50]

        int value = da1.get(2);
        System.out.println(value);  // [30]

        System.out.println(da1.contains(40)); // true
        System.out.println(da1.contains(100)); // false

        System.out.println(da1.size()); // 5
        da1.clear();
        System.out.println(da1); // []
        System.out.println(da1.size()); // 0

        da1.add(10);
        da1.add(20);
        da1.add(30);

        System.out.println(da1);    // [10,20,30]
        da1.set(1, 15);
        System.out.println(da1);    // [10,15,30]


        da1.remove(1);

        System.out.println(da1); // [10,30]
    }
}
