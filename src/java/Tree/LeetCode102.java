package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode102 {
    private static List<List<String>> bfs2(TreeNode treeNode){
        if (treeNode == null){
            return new ArrayList<>();
        }
        List<List<String>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(treeNode);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<String> tempList = new ArrayList<>();
            while (size-- >0){
                TreeNode node = queue.poll();
                tempList.add(node.val);
                if (node.left != null){
                    queue.add(node.left);
                }
                if (node.right != null){
                    queue.add(node.right);
                }
            }
            res.add(tempList);

        }
        return res;
    }
}
