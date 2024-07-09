
public class Q138copylistwithrandompointer {

    public static class Node {

        int val;
        Node next;
        Node random;

        

        

        Node(int val) {
            this.val = val;
            this.next = null;
            this.random=null;
        }
    }


    public static void printer(Node l) {
        Node temp = l;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
    public static  Node copyRandomList(Node head) {
        
        return head;
    }

    public static void main(String[] args) {

        Node p1 = new Node(1);
        Node p11 = new Node(2);
        Node p12 = new Node(3);
        Node x = new Node(4);

        Node p13 = new Node(5);
        Node p14 = new Node(6);
        Node p15 = new Node(7);
        Node z = new Node(8);
        p1.next = p11;
        p11.next = p12;
        p12.next = x;
        x.next=p13;
        p13.next = p14;
        p14.next = p15;
        p15.next = z;
        printer(p1);
        System.out.println();
        System.out.println();

    }



}
