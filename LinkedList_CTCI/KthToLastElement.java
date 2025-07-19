

class Node {
    Node next = null;
    int data;

    Node(int data) {
        this.data = data;
    }

    void insertData(int data) {
        Node newNode = new Node(data);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = newNode;
    }

    void printLinkedList() {
        Node n = this;
        while (n != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.println("null");
    }

    void deleteNode(int data) {
        Node n = this;

        while (n.next != null) {
            if (n.next.data == data) {
                n.next = n.next.next;
                return;
            }
            n = n.next;
        }
    }
}

public class KthToLastElement {

    static void kthToLastElement(Node n, int k) {
        Node fast = n;
        Node slow = n;

        for (int i = 0; i < k; i++) {
            if (fast.next == null)
                System.out.println("out of bounds");
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        System.out.println(slow.data);
    }

    public static void main(String[] args) {
        int[] data = { 123, 21, 3984, 412, 489 };

        Node node = new Node(data[0]);
        for (int i = 1; i < data.length; i++) {
            node.insertData(data[i]);
        }

        node.printLinkedList();

        kthToLastElement(node, 2);

    }
}
