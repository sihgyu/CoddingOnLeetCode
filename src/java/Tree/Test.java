package Tree;

/**
 * @author :yusx
 * @date : 2023/9/8
 */
public class Test {

    /*
    前序遍历：根结点 ---> 左子树 ---> 右子树

    中序遍历：左子树---> 根结点 ---> 右子树

    后序遍历：左子树 ---> 右子树 ---> 根结点

    层次遍历：只需按层次遍历即可
     */

    /**
     * 先序遍历 先根节点 然后左子树 然后右子树
     * @param treeNode node
     */
    private static void preOrder(TreeNode treeNode){
        if (treeNode == null){
            return;
        }
        System.out.print(treeNode.val);
        preOrder(treeNode.left);
        preOrder(treeNode.right);
    }

    private static void midOrder(TreeNode treeNode){
        if (treeNode == null){
            return;
        }
        midOrder(treeNode.left);
        System.out.print(treeNode.val);
        midOrder(treeNode.right);
    }


    private static void lastOrder(TreeNode treeNode){
        if (treeNode == null){
            return;
        }
        lastOrder(treeNode.left);
        lastOrder(treeNode.right);
        System.out.print(treeNode.val);
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
        // 先序
        preOrder(nodeA);
        System.out.println();
        // 中序
        midOrder(nodeA);
        System.out.println();
        // 后序
        lastOrder(nodeA);
    }
}
