

class Node {
    Node next = null;
    int data;

    Node(int data) {
        this.data = data;
    }

    void appendToTail(int data) {
        Node newList = new Node(data);
        Node n = this;

        while (n.next != null) {
            n = n.next;
        }

        n.next = newList;
    }

    void deleteNode(int data){
        Node n = this;
        if (n.data == data) {
            if (n.next != null) {
                n.data = n.next.data;
                n.next = n.next.next;
            } else {
                System.out.println("Can't delete the only node in the list.");
            }
            return;
        }
        while(n.next!=null){
            if(n.next.data == data){
                n.next = n.next.next;
                return ;
            }
            n = n.next;
        }
    }

    void printList(){
        Node n = this.next;
        while(n!=null){
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println();
    }
}

public class LinkedListPractice {
    public static void main(String[] args) {

        int[] data = { 15, 26, 35 };
        
        Node n = new Node(0);

        for (int i =0;i<data.length;i++) {
            n.appendToTail(data[i]);
        }

        n.printList();
        n.deleteNode(35);
        n.printList();

    }
}
