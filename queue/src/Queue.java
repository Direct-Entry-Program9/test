import java.util.ArrayList;
import java.util.Arrays;

public class Queue {
    int[] numbers = new int[0];
    public int peek() {
        if (numbers.length == 0) throw new RuntimeException("Queue is empty");
        return numbers[0];
    }

    public void offer(int value) {        // enqueue == offer
        int[] temp = new int[numbers.length + 1];
        System.arraycopy(numbers, 0, temp, 0, numbers.length);
        temp[temp.length - 1] = value;
        numbers = temp;
    }

    public int size() {
        return numbers.length;
    }

    public int poll() {                  // dequeue == poll
        if (numbers.length == 0) throw new RuntimeException("Empty queue");
        int[] temp = new int[numbers.length - 1];
        System.arraycopy(numbers, 1, temp, 0, numbers.length - 1);
        int dequeueValue = numbers[0];
        numbers = temp;
        return dequeueValue;
    }

    @Override
    public String toString() {
        return Arrays.toString(numbers);
    }
}
