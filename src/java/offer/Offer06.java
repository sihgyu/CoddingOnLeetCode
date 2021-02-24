package offer;

import java.util.Stack;

/**
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 */
public class Offer06 {

    /**
     * 方法1 ：
     * 利用堆栈的特性 先进后出，遍历链表 将所有值压进栈中，然后创建一个和堆栈大小一样的数组，遍历数组依次从栈中弹出元素加入到数组中
     * 但是由于利用了堆栈 耗时达到了2ms
     */
    public static int[] reversePrint(ListNode head) {
        if (head == null) {
            return new int[0];
        }
        Stack<Integer> s = new Stack<>();
        while (head != null) {
            s.push(head.val);
            head = head.next;

        }
        int sum = s.size();
        int[] result = new int[sum];

        for (int i = 0; i < sum; i++) {
            result[i] = s.pop();
        }

        return result;
    }

    /**
     * 方法2：
     * 先遍历一次链表 算出链表的长度，创建一个和链表长度一样的数组，遍历链表 将元素从后向前插入到数组中
     * 时间复杂度0ms
     * 除了返回需要的数组，不借助额外的空间 空间复杂度O(1)
     */
    public static int[] reversePrint2(ListNode head) {
        ListNode tempNode = head;
        int length = 0;
        while (tempNode != null) {
            length++;
            tempNode = tempNode.next;
        }
        int[] result = new int[length];
        while (head != null) {
            result[length - 1] = head.val;
            head = head.next;
            length--;
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(2);
        n1.next = n2;
        n2.next = n3;
        int[] ints = reversePrint2(n1);
        for (int anInt : ints) {
            System.out.println(anInt);
        }

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
