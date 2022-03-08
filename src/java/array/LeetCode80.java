package array;

/**
 * @author yusx
 * @date 2022/3/8 2:27 下午
 */
public class LeetCode80 {

    public static void main(String[] args) {
        int[] a = new int[]{1,1,1,2,2,3};
        method(a);
    }
    public static  int method(int nums[]){
        if (nums == null || nums.length == 0){
            return 0;
        }
        int n = nums.length;
        if (n <= 2){
            return n;
        }

        int slow = 2;
        for (int quick = 2; quick < nums.length; quick++) {
            if (nums[slow - 2] != nums[quick]){
                nums[slow++] = nums[quick];
            }
        }
        return slow;
    }
    // 双指针的升级版，中等题，当快指针指向的数字不等于慢指针前两个的数字的时候替换慢指针指向的 就能恰好保留两个相同的
    // 1 1 1 2 3 从第三个数字起 快指针指向2的时候 和第1个数字不同 那么替换第三个数字 就保留了两个相同的数字
}
