package array;

/**
 * @author yusx
 * @date 2021/5/31 4:59 下午
 */
public class LeetCode27 {
    /**
     * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
     * <p>
     * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
     * <p>
     * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
     */

    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int slow = 0, fast = 0;
        while (fast < nums.length) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}

class Solution {
    public int removeElement(int[] nums, int val) {
        int slow = 0;
        for (int quick = 0; quick < nums.length; quick++) {
            if (nums[quick] != val) {
                nums[slow++] = nums[quick];
            }
        }
        return slow;
    }
}
