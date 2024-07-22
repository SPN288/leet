public class Q24SwapNodesinpairs {
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
    public static  ListNode swapPairs(ListNode head) {
        final int length = getLength(head);
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        ListNode curr = head;
    
        for (int i = 0; i < length / 2; ++i) {
          ListNode next = curr.next;
          curr.next = next.next;
          next.next = curr;
          prev.next = next;
          prev = curr;
          curr = curr.next;
        }
    
        return dummy.next;
      }
    
      private static int getLength(ListNode head) {
        int length = 0;
        for (ListNode curr = head; curr != null; curr = curr.next)
          ++length;
        return length;
      }
      public static void printer(ListNode l) {
        ListNode temp = l;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
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
        p12.next = x;
        x.next=p13;
        p13.next = p14;
        p14.next = p15;
        p15.next = z;
        printer(p1);
        System.out.println();
        
        printer(p13);
        System.out.println();
        

    }
}
