package array;

/**
 * @author yusx
 * @date 2021/5/31 4:29 下午
 */
public class LeetCode26 {
    /**
     * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
     * <p>
     * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
     */

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int fast = 1, slow = 0;
        while (fast < nums.length) {
            if (nums[fast] != nums[slow]) {
                nums[++slow] = nums[fast];
            }
            fast++;
        }
        return ++slow;
    }

    /**
     * 双指针，快慢指针
     * 首先 数组是有序的 就是说所有相同元素一定相邻， 快指针找到不相同的数 交换到慢指针后一位即可
     */

}
