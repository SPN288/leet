
public class Q21mergeTwoSortedlist {

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

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }
        ListNode ans = new ListNode();
        ListNode curr = new ListNode();
        if (list1.val <= list2.val) {
            ans.next = list1;
            curr.next = list1;
            list1 = list1.next;

        } else {
            ans.next = list2;
            curr.next = list2;
            list2 = list2.next;
        }
        curr = curr.next;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                curr.next = list1;
                curr = curr.next;
                list1 = list1.next;
            } else {
                curr.next = list2;
                curr = curr.next;
                list2 = list2.next;
            }
        }
        if (list1 == null) {
            curr.next = list2;
        } else if (list2 == null) {
            curr.next = list1;
        }
        return ans.next;
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
        //p12.next=p13;
        p13.next = p14;
        p14.next = p15;
        p15.next = z;
        printer(p1);
        System.out.println();
        printer(p13);
        System.out.println();
        printer(mergeTwoLists(p1, p13));

    }

}
