

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SumOfNumbers {

    // Function to add two numbers represented by linked lists (to be implemented)
    public static Node addTwoNumbersFuckedUpLoagic(Node l1, Node l2) {

        int list1Size = 0;
        int list2Size = 0;
        Node templ1 = l1;
        Node templ2 = l2;
        while (templ1 != null || templ2 != null) {
            if (templ1 != null) {
                list1Size++;
                templ1 = templ1.next;
            }
            if (templ2 != null) {
                list2Size++;
                templ2 = templ2.next;
            }
        }

        int[] L1Num = new int[list1Size];
        int[] L2Num = new int[list2Size];

        Node l1Temp = l1;
        Node l2Temp = l2;
        int count1 = list1Size - 1;
        int count2 = list2Size - 1;

        while (l1Temp != null || l2Temp != null) {
            if (l1Temp != null) {
                L1Num[count1] = l1Temp.data;
                count1--;
                l1Temp = l1Temp.next;
            }
            if (l2Temp != null) {
                L2Num[count2] = l2Temp.data;
                count2--;
                l2Temp = l2Temp.next;
            }
        }

        int num1 = 0;
        int num2 = 0;
        for (int i : L1Num) {
            num1 = i + num1 * 10;
        }

        for (int i : L2Num) {
            num2 = i + num2 * 10;
        }

        int result = num1 + num2;
        int[] resultArray = intToArray(result);

        Node resultNode = createList(resultArray);
        System.out.println(L1Num);

        return resultNode;
    }

    public static int[] intToArray(int num) {
        String temp = Integer.toString(num);
        int[] newGuess = new int[temp.length()];

        // Fill in reverse to match the reverse-order linked list
        for (int i = 0; i < temp.length(); i++) {
            newGuess[i] = Character.getNumericValue(temp.charAt(temp.length() - 1 - i));
        }

        return newGuess;
    }


    public static Node addTwoNumbers(Node n1,Node n2){
        Node tempHead = new Node(0);
        Node current = tempHead;
        int carry =0;

        while(n1!=null || n2!=null || carry>0){
            int sum = carry;
            if(n1!=null){
                sum += n1.data;
                n1 = n1.next;
            }
            if(n2!=null){
                sum+=n2.data;
                n2 = n2.next;
            }
            carry = sum/10;

            current.next = new Node(sum%10);
            current = current.next;
        }

        return tempHead.next;
    }

    // Helper function to print linked list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null)
                System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    // Helper function to create a linked list from an array of integers
    public static Node createList(int[] digits) {
        Node head = new Node(digits[0]);
        Node current = head;
        for (int i = 1; i < digits.length; i++) {
            current.next = new Node(digits[i]);
            current = current.next;
        }
        return head;
    }

    // Test cases
    public static void main(String[] args) {
        // Test 1: (7 -> 1 -> 6) + (5 -> 9 -> 2) = 2 -> 1 -> 9
        Node l1 = createList(new int[] { 7, 1, 6 });
        Node l2 = createList(new int[] { 5, 9, 2 });
        System.out.print("Input 1: ");
        printList(l1);
        System.out.print("Input 2: ");
        printList(l2);
        Node result = addTwoNumbers(l1, l2);
        System.out.print("Output : ");
        printList(result);

        // Test 2: (9 -> 9) + (1) = 0 -> 0 -> 1
        Node l3 = createList(new int[] { 9, 9 });
        Node l4 = createList(new int[] { 1 });
        System.out.print("\nInput 1: ");
        printList(l3);
        System.out.print("Input 2: ");
        printList(l4);
        Node result2 = addTwoNumbers(l3, l4);
        System.out.print("Output : ");
        printList(result2);

        // Add more test cases as needed
    }
}
