public class Demo {
    public static void main(String[] args) {
        var stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        int index = stack.search(20);  // From top(HEAD = 1)
        System.out.println(index);      // 2

        int value = stack.peek();
        System.out.println(value);  // 30

        stack.pop();
        System.out.println(stack.peek());  // 20

        System.out.println(stack.size()); // 2
        stack.clear();
        System.out.println(stack.size()); // 0
    }
}
