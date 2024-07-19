public class Q19deleteNthNode {
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


    public static void printer(ListNode l) {
        ListNode temp = l;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
    
        while (n-- > 0)
          fast = fast.next;
        if (fast == null)
          return head.next;
    
        while (fast.next != null) {
          slow = slow.next;
          fast = fast.next;
        }
        slow.next = slow.next.next;
    
        return head;
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
        removeNthFromEnd(p1, 3);
        printer(p1);

    }

}
