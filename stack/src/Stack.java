public class Stack {
    int[] numbers = new int[0];

    public void push(int value){
        int[] temp = new int[numbers.length + 1];
        for (int i = 0; i < numbers.length; i++) {
            temp[i] = numbers[i];
        }
        temp[numbers.length] = value;
        numbers = temp;
    }

    public int search(int value){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]==value) return numbers.length-i;
        }
        return -1;
    }

    public int peek(){
        if (numbers.length == 0) throw new RuntimeException("Empty stack");
        return numbers[numbers.length-1];
    }

    public void pop(){
        if (numbers.length == 0) throw new RuntimeException("Empty stack");
        int[] temp = new int[numbers.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = numbers[i];
        }
        numbers = temp;
    }

    public int size(){
        return numbers.length;
    }
    public void clear(){
        numbers = new int[0];
    }
}
