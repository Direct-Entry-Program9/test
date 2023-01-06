public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public void add(int value){
        if (head == null){
            head = new Node(value,null);
            tail=head;
        }else {
            tail.next = new Node(value,null);
            tail = tail.next;
        }
        size++;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if (head == null) return "[]";
        Node temp = head;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(temp.value).append(",");
        while (temp.next!=null){
            temp=temp.next;
            sb.append(temp.value).append(",");
        }
        sb.replace(sb.length()-1, sb.length(), "]");
        return sb.toString();
    }

    public void remove(int index){
        if (index<0 || index>=size) throw new RuntimeException("Index out of bound exception: "+ index);
        if (index == 0){
            head = head.next;
        }else {
            Node temp = head;
            for (int i = 0; i < index-1; i++) {
                temp= temp.next;
            }
            if (temp.next == tail){
                tail=temp;
            }
            temp.next=temp.next.next;
        }
        size--;
    }

    public boolean contains(int value){

        Node temp = head;
        while (temp.next!= null){
            if (temp.value==value) return true;
            temp = temp.next;
        }
        return tail.value == value;
    }

    public int get(int index){
        if (index<0 || index>=size) throw new RuntimeException("Index out of bound exception: "+ index);
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        return temp.value;
    }
    public void set(int index, int value){
        if (index<0 || index>=size) throw new RuntimeException("Index out of bound exception: "+ index);
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.value = value;
    }
    public void clear(){
        head = null;
        tail = null;
        size = 0;
    }

    public void reverse(){
        Node previous = head;
        Node current = head.next;

        while (current != null) {
            Node temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }

        tail= head;
        tail.next=null;
        head = previous;

    }
}
