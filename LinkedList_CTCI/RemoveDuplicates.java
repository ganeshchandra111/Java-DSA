
import java.util.HashSet;

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
        while (n.next != null) {
            System.out.print(n.next.data + " -> ");
            n = n.next;
        }
        System.out.print("null");
        System.out.println();
    }

    void deleteNode(int data){
        Node n = this;

        while(n.next!=null){
            if(n.next.data == data){
                n.next = n.next.next;
                return;
            }
            n = n.next;
        }
    }
}

public class RemoveDuplicates {

    static void removeDupsFromLinkedList(Node n){
        HashSet hs = new HashSet();

        while(n.next!=null){
            if(hs.contains(n.next.data)){
                n.deleteNode(n.next.data);
            }else{
                hs.add(n.next.data);
            }
            n = n.next;
        }
    }

    public static void main(String[] args) {
        int[] data = { 1, 2, 3, 3, 5 };
        Node node = new Node(0);

        for (int i : data) {
            node.insertData(i);
        }

        node.printLinkedList();

        removeDupsFromLinkedList(node);

        node.printLinkedList();
    }
}
