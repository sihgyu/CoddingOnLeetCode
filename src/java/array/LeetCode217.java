package array;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LeetCode217 {
    public static void main(String[] args) {
        /**
         * 给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false 。
         *  
         *
         * 示例 1：
         *
         * 输入：nums = [1,2,3,1]
         * 输出：true
         * 示例 2：
         *
         * 输入：nums = [1,2,3,4]
         * 输出：false
         * 示例 3：
         *
         * 输入：nums = [1,1,1,3,3,4,3,2,4,2]
         * 输出：true
         *
         * 来源：力扣（LeetCode）
         * 链接：https://leetcode.cn/problems/contains-duplicate
         * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
         */

    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            if (!numSet.add(num)) {
                return true;
            }
        }
        return false;
    }

}

