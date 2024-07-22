
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

    
    public static ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        if (head.next.next == null) {
            ListNode temp = head;
            head = head.next;
            head.next = temp;
            temp.next = null;
            return head;
        }
        if (head.next.next.next == null) {
            ListNode temp = head;
            ListNode se = head.next;
            head = se;
            temp.next = se.next;
            se.next = temp;
            return head;
        }
        ListNode prev;
        ListNode curr = head;
        ListNode nextNode = curr.next;
        head = nextNode;

        curr.next = nextNode.next;
        nextNode.next = curr;
        prev = curr;
        curr = prev.next;
        nextNode = curr.next;

        while (prev.next != null) {
            curr.next = nextNode.next;
            nextNode.next = curr;
            prev.next = nextNode;
            prev = curr;
            if (prev.next == null) {
                return head;
            }
            curr = prev.next;
            if (curr.next == null) {
                return head;
            }
            nextNode = curr.next;
        }
        return head;
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
        ListNode p2 = new ListNode(2);
        ListNode p3 = new ListNode(3);
        ListNode p4 = new ListNode(4);

        ListNode p5 = new ListNode(5);
        ListNode p6 = new ListNode(6);
        ListNode p7 = new ListNode(7);
        ListNode p8 = new ListNode(8);
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;
        p5.next = p6;
        p6.next = p7;
        p7.next = p8;
        printer(p1);
        System.out.println();
        printer(swapPairs(p1));
        System.out.println();

    }
}
