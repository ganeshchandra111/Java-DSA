



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

public class DeleteMiddleNodes {

    public static void deleteTheMiddleNode(Node head) {
        int listLen = 0;
        Node temp = head;
        while (temp != null) {
            listLen++;
            temp = temp.next;
        }

        if (listLen <= 1) return; 


        int mid = listLen / 2;
        int count = 0;
        Node current = head;

        while (current != null) {
            if (count == mid - 1) {
                // Delete the middle node
                if (current.next != null) {
                    current.next = current.next.next;
                }
                return;
            }
            current = current.next;
            count++;
        }
    }

    static void deleteMidNodeFast(Node node){
        Node fast = node;
        Node slow = node;
        Node prev = null;

        while(fast !=null && fast.next!=null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        prev.next = slow.next;
    }

    public static void main(String[] args) {
        int[] data = {123, 21, 3984, 412, 489};

        Node node = new Node(data[0]);
        for (int i = 1; i < data.length; i++) {
            node.insertData(data[i]);
        }

        // System.out.println("Original List:");
        // node.printLinkedList();

        // deleteTheMiddleNode(node);

        // System.out.println("After Deleting Middle Node:");
        // node.printLinkedList();

        System.out.println("Fast Delete");
        deleteMidNodeFast(node);
        node.printLinkedList();
    }
}
