package linkedList;

/**
 * @author :yusx
 * @date : 2023/10/9
 */
public class LeetCode141 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != slow){
            if (fast == null || fast.next == null){
                return false;
            }
            // 龟兔赛跑？ 快指针每次两步 慢指针每次一步 如果成环 快指针先一步进入环中 扣圈必定与慢指针相遇
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
    }
}
