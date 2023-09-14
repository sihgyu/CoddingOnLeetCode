package Tree;

/**
 * @author :yusx
 * @date : 2023/9/14
 */
public class LeetCode101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null){
            return true;
        }
        // dfs 递归
        // 判断左子树的左节点和右子树的右节点是否相等
        // 判断左子树的右节点和右子树的左节点是否相等
        return dfs(root.left,root.right);
    }

    private boolean dfs(TreeNode node1 ,TreeNode node2){
        if (node1 == null && node2 ==null){
            return true;
        } else if (node1 == null || node2 ==null){
            return false;
        } else if (node1.val != node2.val){
            return false;
        }
        return dfs(node1.left,node2.right) && dfs(node1.right,node2.left);
    }
}
