package Tree;

import java.util.Stack;

/**
 * @author :yusx
 * @date : 2023/9/8
 */
public class Test {

    /*
     * 前序遍历：根结点 ---> 左子树 ---> 右子树
     * 
     * 中序遍历：左子树---> 根结点 ---> 右子树
     * 
     * 后序遍历：左子树 ---> 右子树 ---> 根结点
     * 
     * 层次遍历：只需按层次遍历即可
     */

    /**
     * 先序遍历 先根节点 然后左子树 然后右子树
     *
     * @param treeNode node
     */
    private static void preOrder(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        System.out.print(treeNode.val);
        preOrder(treeNode.left);
        preOrder(treeNode.right);
    }

    /**
     * 先序遍历 非递归
     */
    private static void preOrder2(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(treeNode);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.print(node.val);
            // 由于先序遍历是 根节点 左子树 右子树 但是栈是先进后出 所以先右子树入栈
            if (null != node.right) {
                stack.push(node.right);
            }
            if (null != node.left) {
                stack.push(node.left);
            }
        }
    }

    /**
     * 中序遍历 左 根 右
     *
     * @param treeNode node
     */
    private static void midOrder(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        midOrder(treeNode.left);
        System.out.print(treeNode.val);
        midOrder(treeNode.right);
    }

    /**
     * 中序非递归
     * 
     * @param treeNode node
     */
    private static void midOrder2(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(treeNode);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.print(node.val);
            // 由于先序遍历是 根节点 左子树 右子树 但是栈是先进后出 所以先右子树入栈
            if (null != node.right) {
                stack.push(node.right);
            }
            if (null != node.left) {
                stack.push(node.left);
            }
        }
    }

    /**
     * 后续遍历 左 右 根
     *
     * @param treeNode node
     */
    private static void lastOrder(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        lastOrder(treeNode.left);
        lastOrder(treeNode.right);
        System.out.print(treeNode.val);
    }

    /**
     * 后续遍历非递归
     * 
     * @param treeNode node
     */
    private static void lastOrder2(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> stack1 = new Stack<>();
        stack.push(treeNode);
        // 后续遍历的顺序为 左右根 前序遍历的顺序为根左右 由此发现 将前序的顺序压入另一个栈输出即可
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            stack1.push(node);
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }

        }
        while (!stack1.isEmpty()) {
            System.out.print(stack1.pop().val);
        }
    }

    public static void main(String[] args) {
        TreeNode nodeA = new TreeNode("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");
        TreeNode nodeD = new TreeNode("D");
        TreeNode nodeE = new TreeNode("E");
        TreeNode nodeF = new TreeNode("F");
        TreeNode nodeG = new TreeNode("G");
        nodeA.left = nodeB;
        nodeA.right = nodeC;
        nodeB.left = nodeD;
        nodeB.right = nodeE;
        nodeC.right = nodeF;
        nodeE.left = nodeG;
        System.out.println("先序遍历递归");
        // 先序
        preOrder(nodeA);
        System.out.println("\n中序遍历递归");
        // 中序
        midOrder(nodeA);
        System.out.println("\n后续遍历递归");
        // 后序
        lastOrder(nodeA);
        System.out.println("\n先序遍历非递归");
        preOrder2(nodeA);
        System.out.println("\n中序遍历非递归");
        midOrder2(nodeA);
        System.out.println("\n后序遍历非递归");
        lastOrder2(nodeA);
    }
}
