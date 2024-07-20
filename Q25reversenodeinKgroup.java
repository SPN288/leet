public class Q25reversenodeinKgroup {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null)
          return null;
    
        ListNode tail = head;
    
        for (int i = 0; i < k; ++i) {
          // There are less than k nodes in the list, do nothing.
          if (tail == null)
            return head;
          tail = tail.next;
        }
    
        ListNode newHead = reverse(head, tail);
        head.next = reverseKGroup(tail, k);
        return newHead;
      }
    
      // Reverses [head, tail).
      private static ListNode reverse(ListNode head, ListNode tail) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != tail) {
          ListNode next = curr.next;
          curr.next = prev;
          prev = curr;
          curr = next;
        }
        return prev;
      }

      public static void printer(ListNode l) {
        ListNode temp = l;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

      public static void main(String[] args) {

        ListNode p1 = new ListNode(1);
        ListNode p11 = new ListNode(2);
        ListNode p12 = new ListNode(4);
        ListNode x = new ListNode(5);

        ListNode p13 = new ListNode(1);
        ListNode p14 = new ListNode(3);
        ListNode p15 = new ListNode(4);
        ListNode z = new ListNode(8);
        p1.next = p11;
        p11.next = p12;
        x.next = x;
        p12.next=p13;
        p13.next = p14;
        p14.next = p15;
        p15.next = z;
        printer(p1);
        reverseKGroup(p1, 3);
        printer(p1);

    }
}
