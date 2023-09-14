package Tree;

/**
 * @author :yusx
 * @date : 2023/9/14
 */
public class LeetCode100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 如果两个树都为空 认为相同
        if (p == null && q == null) {
            return true;
        }else if (p == null || q == null) {
            return false;
        }else if (p.val != q.val){
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
