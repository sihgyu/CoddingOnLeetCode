package array;

/**
 * @author yusx
 * @date 2022/3/7 10:02 上午
 */
public class LeetCode283 {
    /**
     * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
     *
     * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
     */
    public static void main(String[] args) {
        int[] nums=new int[]{0,1,0,3,12};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
        int slowFlag = 0;
        for (int quickFlag = 0; quickFlag < nums.length; quickFlag++) {
            if (nums[quickFlag] != 0) {
                nums[slowFlag++] = nums[quickFlag];
            }

        }
        for (int i = slowFlag; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}


