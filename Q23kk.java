import java.util.PriorityQueue;
import java.util.Queue;

public class Q23kk {
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

    public static  ListNode mergeKLists(ListNode[] lists) {
    ListNode dummy = new ListNode(0);
    ListNode curr = dummy;
    Queue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

    for (final ListNode list : lists)
      if (list != null)
        minHeap.offer(list);

    while (!minHeap.isEmpty()) {
      ListNode minNode = minHeap.poll();
      if (minNode.next != null)
        minHeap.offer(minNode.next);
      curr.next = minNode;
      curr = curr.next;
    }

    return dummy.next;
  }

    public static void main(String[] args) {
        
    }
}
