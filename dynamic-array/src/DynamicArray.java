import java.util.Arrays;

public class DynamicArray {

    int[] numbers =  new int[0];

    public void add(int value){
        int[] tempArray = new int[numbers.length+1];
        for (int i = 0; i < numbers.length; i++) {
            tempArray[i] = numbers[i];
        }
        tempArray[numbers.length]=value;
        numbers=tempArray;
    }

    @Override
    public String toString() {
        return Arrays.toString(numbers);
    }

    public void remove(int index){
        if (index < 0 || index >= numbers.length) {
            throw new RuntimeException("Index out of bound exception: " + index);
        }
        int[] tempArray = new int[numbers.length-1];
        for (int i = 0; i < numbers.length; i++) {
            if (i<index) tempArray[i] = numbers[i];
            else if (i > index) {
                tempArray[i-1]=numbers[i];
            }
        }
        numbers=tempArray;
    }

    public int get(int index){
        if (index < 0 || index >= numbers.length) {
            throw new RuntimeException("Index out of bound exception: " + index);
        }
        return numbers[index];
    }

    public boolean contains(int value){
        for (int number : numbers) {
            if (number == value) return true;
        }
        return false;
    }

    public int size(){
        return numbers.length;
    }

    public void clear(){
        numbers = new int[0];
    }

    public void set(int index, int value){
        if (index < 0 || index >= numbers.length) {
            throw new RuntimeException("Index out of bound exception: " + index);
        }
        numbers[index]=value;
    }
}
