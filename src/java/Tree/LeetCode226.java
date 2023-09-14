package Tree;

/**
 * @author :yusx
 * @date : 2023/9/14
 */
public class LeetCode226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null){
            return root;
        }
        // 递归交换每一层的左右子树
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
