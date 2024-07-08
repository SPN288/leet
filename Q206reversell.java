public class Q206reversell {
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

    public static  ListNode reverseList(ListNode head) {
        ListNode prev =null;
        ListNode curr =head;
        ListNode nxt;

        while(curr!=null){
            nxt=curr.next;           
            curr.next=prev;
            prev=curr;
            head=curr;
            curr=nxt;

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
        ListNode p11 = new ListNode(2);
        ListNode p12 = new ListNode(3);
        ListNode x = new ListNode(4);

        ListNode p13 = new ListNode(5);
        ListNode p14 = new ListNode(6);
        ListNode p15 = new ListNode(7);
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
        printer(reverseList(p1));
        System.out.println();

    }
}
