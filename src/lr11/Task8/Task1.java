package lr11.Task8;

import lr11.Task8.Node;

public class Task1 {

    public static void createHead() {
        Node head = new Node(1, null);
        while (head.value < 10) {
            head = new Node (1 + head.value, head);
        }
    }

    public static void createTail() {
        Node head = null;
        for (int i = 9; i >= 0; i--) {
            head = new Node(i, head);
        }
    }

    public String toString(Node head) {
        String str = null;
        Node ref = head;
        while (ref != null) {
            System.out.println(" " + ref.value);
            str = str + ref.value;
            ref = ref.next;

        }
        return str;
    }
    public static void AddFirst(Node exHead) {
        Node head = new Node(9, exHead);

    }
    public static void AddLast(Node head) {
        Node newtail = new Node(123, null);
        Node ref = head;
        while (ref.next != null) { // пока не последний элемент
            ref = ref.next;
        }
        ref.next=newtail;
    }
    public static void Insert(Node head) {
        Node newNode = new Node(44, null);
        Node ref = head;
        int k = 1;
        while (ref.next != null && (k < 2)) {
            ref = ref.next;
            k++;
        }
        newNode.next = ref.next.next;
        ref.next = newNode;
    }
    public static void RemoveLast(Node head) {
        Node ref = head;
        while (ref.next.next != null) {
            ref = ref.next;
        }
// полю next предпоследнего элемента присваиваем null
        ref.next=null;

    }
    public static void RemoveFirst(Node head) {
        head = null;

    }
    public static void Remove(Node head) {
        Node ref = head;
        int k = 1;
        while (ref.next != null && (k < 2)) {
            ref = ref.next;
            k++;
        }
        ref.next = ref.next.next;

    }
   /*


    Remove()*/
}
