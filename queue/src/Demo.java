public class Demo {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        System.out.println(queue.size());   // 5
        System.out.println(queue);
        int value = queue.poll();
        System.out.println(value);  // 10
        System.out.println(queue.size()); // 4
        System.out.println(queue); // [50(T),40,30,20(H)]
        System.out.println(queue.peek());   // 20
    }
}
