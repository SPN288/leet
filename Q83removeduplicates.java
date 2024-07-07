
public class Q83removeduplicates {

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

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while (curr != null) {

            if (curr.next != null && curr.val == curr.next.val) {
                if (curr.next.next == null) {
                    curr.next = null;
                } else {
                    curr.next = curr.next.next;
                }
            }else{

                curr = curr.next;
            }
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
        ListNode p11 = new ListNode(1);
        ListNode p12=new ListNode(1);
        // ListNode p13=new ListNode(3);
        // ListNode p14=new ListNode(4);
        // ListNode p15=new ListNode(4);
        p1.next = p11;
        p11.next=p12;
        // p12.next=p13;
        // p13.next=p14;
        // p14.next=p15;
        printer(p1);
        deleteDuplicates(p1);
        System.out.println();
        printer(p1);

    }
}
