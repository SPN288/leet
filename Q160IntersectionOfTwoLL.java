public class Q160IntersectionOfTwoLL {
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

    public static  ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a=headA;
        while(a!=null){
            ListNode b=headB;
            while(b!=null){
                if(a==b){return a;}
                b=b.next;
            }
            a=a.next;
        }
        return null;
    }
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
          ListNode a = headA;
          ListNode b = headB;
      
          while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
          }
      
          return a;
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

    public static void main(String[] args) {

        ListNode p1 = new ListNode(1);
        ListNode p11 = new ListNode(2);
        ListNode p12 = new ListNode(3);

        ListNode x = new ListNode(4);
        ListNode p13 = new ListNode(0);
        ListNode p14 = new ListNode(2);

        ListNode p15 = new ListNode(2);
        ListNode z = new ListNode(1);

        p1.next = p11;
        p11.next = p12;
        p12.next = p15;

        x.next=p13;
        p13.next = p14;
        p14.next = p15;

        p15.next = z;
        printer(p1);
        printer(x);
        printer(getIntersectionNode(p1, x));


    }
    
}
