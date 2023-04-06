package lr11.Task5;

import lr11.Task5.Node;

public class Example2 {
    public static void main(String[] args) {
        lr11.Task5.Node head = null;
        for (int i = 9; i >= 0; i--) {
            head = new lr11.Task5.Node(i, head);
        }
        lr11.Task5.Node ref = head;
        while (ref != null) {
            System.out.println(" " + ref.value);
            ref = ref.next;
        }
    }
}
