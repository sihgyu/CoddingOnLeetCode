package linkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class LeetCode19 {
    // 删除倒数第n个节点
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        Stack<ListNode> stack1 = new Stack<>();
        ListNode cur = dummy;
        while (cur != null) {
            stack1.push(cur);
            cur = cur.next;
        }
        for (int i = 0; i < n; ++i) {
            stack1.pop();
        }
        ListNode prev = stack1.peek();
        prev.next = prev.next.next;
        ListNode ans = dummy.next;
        return ans;
    }

}
