package lr11.Task8;

public class Task2 {
    public static void main(String[] args) {
        Node head = new Node(1, null);
        head = createHeadRec(head);
        Node ref = head;
        createTailRec(head);
       toStringRec(head);

    }
    public static Node createHeadRec(Node head) {

    if (head.value < 10) {
        head = new Node (1 + head.value, head);
        createHeadRec(head);
        }
        return head;
    }

    public static void createTailRec(Node head) {
        Node newtail = new Node(156, null);
        Node ref = head;
        if (ref.next != null) {
            createTailRec(ref.next);
        }
        ref.next=newtail;

    }
    public static void toStringRec(Node head) {
        Node ref = head;
        if (ref != null) {
            System.out.println(" " + ref.value);
            toStringRec(ref.next);
        }

    }
}

