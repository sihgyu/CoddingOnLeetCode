package Tree;

/**
 * @author :yusx
 * @date : 2023/9/8
 */
public class LeetCode104 {

    /**
     * DFS
     *
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        if (null == root) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

}
