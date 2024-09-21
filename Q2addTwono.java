public class Q2addTwono {

    // Definition for singly-linked list.
    public static class ListNode {
        int val;       // Value of the node
        ListNode next; // Reference to the next node
        
        // Default constructor
        ListNode() {}
        
        // Constructor with value
        ListNode(int val) { 
            this.val = val; 
        }
        
        // Constructor with value and next node
        ListNode(int val, ListNode next) { 
            this.val = val; 
            this.next = next; 
        }
    }

    /**
     * Adds two numbers represented by linked lists and returns the result as a linked list.
     * The digits are stored in reverse order (i.e., the 1's place is the head of the list).
     * 
     * @param l1 The head of the first linked list.
     * @param l2 The head of the second linked list.
     * @return The head of the linked list representing the sum of the two numbers.
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Dummy node to simplify the result list construction
        ListNode ans = new ListNode(0);
        ListNode temp = ans; // Pointer to traverse the result list
        int carry = 0; // Variable to store carry-over during addition
        
        // Traverse both lists until both are null
        while (l1 != null || l2 != null) {
            // Add the value from l1 if it exists
            if (l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }
            // Add the value from l2 if it exists
            if (l2 != null) {
                carry += l2.val;
                l2 = l2.next;
            }
            // Create a new node with the digit value of carry % 10
            temp.next = new ListNode(carry % 10);
            carry = carry / 10; // Update carry
            temp = temp.next; // Move to the next node in the result list
        }
        
        // Return the result list starting from the node after the dummy node
        return ans.next;
    }

    /**
     * Converts a binary number represented by a linked list into its decimal value.
     * The digits are stored in reverse order (i.e., the 1's place is the head of the list).
     * 
     * @param head The head of the linked list representing the binary number.
     * @return The decimal value of the binary number.
     */
    public static int getDecimalValue(ListNode head) {
        // Variables to store the decimal value and length of the list
        int ans = 0;
        int count = 0;
        ListNode temp = head;
        
        // Compute the length of the list
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        
        // Create an array to store the binary digits in reverse order
        temp = head;
        int[] arr = new int[count];
        while (temp != null) {
            arr[count - 1] = temp.val;
            count--;
            temp = temp.next;
        }
        
        // Convert the binary array to decimal value
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                ans += Math.pow(2, i);
            }
        }
        
        return ans;
    }

    /**
     * Prints the values of a linked list to the console.
     * 
     * @param l The head of the linked list to print.
     */
    public static void printer(ListNode l) {
        ListNode temp = l;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println(); // Print a newline at the end
    }

    public static void main(String[] args) {
        // Test case for addTwoNumbers function
        // Linked list 1: 2 -> 4 -> 3 (represents number 342)
        // Linked list 2: 5 -> 6 -> 4 (represents number 465)
        // Result: 7 -> 0 -> 8 (represents number 807)
        /*
        ListNode l1 = new ListNode(2);
        ListNode l11 = new ListNode(4);
        ListNode l12 = new ListNode(3);
        l1.next = l11;
        l11.next = l12;

        ListNode l2 = new ListNode(5);
        ListNode l21 = new ListNode(6);
        ListNode l22 = new ListNode(4);
        l2.next = l21;
        l21.next = l22;

        printer(addTwoNumbers(l1, l2));
        */

        // Test case for getDecimalValue function
        // Linked list: 1 -> 0 -> 1 (represents binary 101)
        // Decimal value: 5
        ListNode p1 = new ListNode(1);
        ListNode p11 = new ListNode(0);
        ListNode p12 = new ListNode(1);
        p1.next = p11;
        p11.next = p12;
        System.out.println(getDecimalValue(p1)); // Expected output: 5
    }
}
