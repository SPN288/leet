public class Q1290Binarytodecimal {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static  int getDecimalValue(ListNode head) {
   
       int ans=0,count=0;
       ListNode temp=head;
       while(temp!=null){
           count++;
           temp=temp.next;
       }
       temp=head;
       int[] arr=new int[count];
       while(temp!=null){
           arr[count-1]=temp.val;
           count--;
           temp=temp.next;
       }

       for (int i = 0; i < arr.length; i++) {
           if(arr[i]==1){ans+=Math.pow(2, i);}
       }
       return ans;
   }

    public static void main(String[] args) {
       
       ListNode p1=new ListNode(1);
       ListNode p11=new ListNode(0);
       ListNode p12=new ListNode(1);
       p1.next=p11;p11.next=p12;
       System.out.println(getDecimalValue(p1));
       
        
    }
    
}
