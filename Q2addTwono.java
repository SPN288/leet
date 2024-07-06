public class Q2addTwono {
    public static class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }


         public static  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode ans =new ListNode(0);
            ListNode temp=ans;
            int carry=0;
            while(l1!=null||l2!=null){
                if(l1!=null){
                    carry+=l1.val;
                    l1=l1.next;
                }
                if(l2!=null){
                    carry+=l2.val;
                    l2=l2.next;
                }
                temp.next=new ListNode(carry%10);
                carry=carry/10;
                temp=temp.next;


            }
            return ans.next;
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


        public static void printer(ListNode l){
            ListNode temp=l;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
        }

         public static void main(String[] args) {
            // ListNode l1=new ListNode(2);
            // ListNode l11=new ListNode(4);
            // ListNode l12=new ListNode(3);
            // l1.next=l11;l11.next=l12;

            // ListNode l2=new ListNode(5);
            // ListNode l21=new ListNode(6);
            // ListNode l22=new ListNode(4);
            // l2.next=l21;l21.next=l22;

            // printer(addTwoNumbers(l1, l2));

            ListNode p1=new ListNode(1);
            ListNode p11=new ListNode(0);
            ListNode p12=new ListNode(1);
            p1.next=p11;p11.next=p12;
            System.out.println(getDecimalValue(p1));
            
             
         }
}
