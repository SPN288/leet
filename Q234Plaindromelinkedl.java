import java.util.ArrayList;

public class Q234Plaindromelinkedl {
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
    public static  boolean isPalindrome(ListNode head) {
        if(head==null){return false;}
        if(head.next==null){return true;}
        ListNode temp=head;
        int size=0;
        ArrayList<Integer> mylist=new ArrayList<>();
        while(temp!=null){
            mylist.add(temp.val);
            size++;
            temp=temp.next;
        }
        for (int i = 0; i < size/2; i++) {
            if(mylist.get(i)!=mylist.get(size-i-1)){
                return false;
            }
        }
        
        return true;
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

        ListNode p13 = new ListNode(4);
        ListNode p14 = new ListNode(2);
        ListNode p15 = new ListNode(2);
        ListNode z = new ListNode(1);
        p1.next = p11;
        p11.next = p12;
        p12.next = x;
        x.next=p13;
        p13.next = p14;
        p14.next = p15;
        p15.next = z;
        printer(p1);
        System.out.println();

        System.out.println(isPalindrome(p1));

    }
    
}
