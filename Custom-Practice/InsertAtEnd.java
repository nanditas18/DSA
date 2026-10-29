class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class InsertAtEnd {
    static Node InsertAtEnd(int x, Node head) {
        Node newNode = new Node(x);
        if (head == null) {
            return newNode;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
            if (temp != null) {
                System.out.print(" -> ");
            }
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        System.out.print("Before Insertion: ");
        print(head);
        head = InsertAtEnd(4, head);
        System.out.println();
        System.out.print("After Insertion: ");
        print(head);
    }
}