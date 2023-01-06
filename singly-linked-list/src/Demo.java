public class Demo {
    public static void main(String[] args) {
        var list = new SinglyLinkedList();
        System.out.println(list);   // []
        list.add(10);
        System.out.println(list.size());    // 1
        list.add(20);
        list.add(30);
        list.add(40);
        list.reverse();
        System.out.println(list);
//        System.out.println(list);   // [10,20,30,40]
//        System.out.println(list.size());    // 4
//        list.remove(3);
//        System.out.println(list.size());    // 3
//        System.out.println(list);
//        list.add(50);
//        System.out.println(list.size());    // 4
//        System.out.println(list);   // [10,20,30,50]
//        list.remove(2);
//        System.out.println(list);   // [10,20,50]
//        System.out.println(list.contains(10));  // true
//        System.out.println(list.contains(20));  // true
//        System.out.println(list.contains(50));  // true
//        System.out.println(list.contains(40));  // false
//        System.out.println(list.get(2));    // 50
//        System.out.println(list.size());    // 3
//        list.set(2, 40);
//        System.out.println(list);   // [10,20,40]
//        list.clear();
//        System.out.println(list);   // []
    }
}
