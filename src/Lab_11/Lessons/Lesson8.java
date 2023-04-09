package Lab_11.Lessons;

public class Lesson8 {

    static Node head;
    static Node tail;

    public static void main(String[] args) {
        addFirst(5);
        addFirst(4);
        addFirst(6);

        addLast(1);
        addLast(3);
        addLast(2);

        insert(12, 1);

        removeFirst();
        removeLast();
        remove(2);

        System.out.println(printNode());
    }

    public static void addFirst(int value) {
        Node element = new Node();

        element.value = value;

        if (head == null) {
            head = element;
            tail = element;
        } else {
            element.next = head;
            head = element;
        }
    }

    public static void addLast(int value) {
        Node element = new Node();

        element.value = value;

        if (tail == null) {
            head = element;
            tail = element;
        } else {
            tail.next = element;
            tail = element;
        }
    }

    public static void insert(int value, int index) {
        Node element = new Node(value, null);
        Node ref = head;
        int k = 0;
        while (ref.next != null && (k < index)) {
            ref = ref.next;
            k++;
        }
        element.next = ref.next;
        ref.next = element;
    }

    public static void removeFirst() {
        if (head == null) {
            System.out.println("list is empty");
        } else {
            head = head.next;
        }
    }

    public static void removeLast() {
        Node ref = head;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next = null;
    }

    public static void remove(int index) {
        Node ref = head;
        int k = 1;
        while (ref.next != null && (k < index)) {
            ref = ref.next;
            k++;
        }
        ref.next = ref.next.next;
    }

    public static String printNode() {
        Node temp = head;
        String s = "";
        while (temp != null) {
//            s = String.join(" ", temp.value);
            s += temp.value + " ";
//            System.out.println(temp.value);
            temp = temp.next;
        }
        return s;
    }

}
