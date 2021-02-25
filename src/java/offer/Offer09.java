package offer;

import java.util.Stack;


/**
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 *
 * 示例 1：
 * 输入：
 * ["CQueue","appendTail","deleteHead","deleteHead"]
 * [[],[3],[],[]]
 * 输出：[null,null,3,-1]
 * 示例 2：
 * 输入：
 * ["CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"]
 * [[],[],[5],[2],[],[]]
 * 输出：[null,-1,null,null,5,2]
 */
public class Offer09 {
    Stack<Integer> s1;
    Stack<Integer> s2;

    public Offer09() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void appendTail(int value) {
        s1.push(value);
    }

    public int deleteHead() {
        if (!s2.isEmpty()) {
            return s2.pop();
        } else {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.isEmpty() ? -1 : s2.pop();

    }

    /*
     * 思路：
     * 队列是一种先入先出的结构，而堆栈则是先入后出，如果想用堆栈模拟队列，想取出第一个元素的时候，需要把堆中的所有元素倒出来，然后拿第一个
     * 有一种简单的思路是：用一个栈 只加元素 第二个栈只取元素。
     * 当像队列中添加一个元素的时候，添加到堆栈1中，取元素的时候从堆栈2中取，首先判断堆栈2是否是空的：
     * 1、如果堆栈2是空的，堆栈1非空，则把堆栈1依次添加到堆栈2中，弹出堆栈2的栈顶元素
     * 2、如果堆栈2非空直接弹出栈顶元素。
     * 这样 一个负责加元素 一个负责删除元素 可以减少倒元素的频率
     */
}
