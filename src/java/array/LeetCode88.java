package array;

/**
 * @author :yusx
 * @date : 2023/9/1
 */
public class LeetCode88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int tail = m + n - 1;
        while (p1 >= 0 && p2 >= 0) {
            nums1[tail--] = nums1[p1] > nums2[p2] ? nums1[p1--] : nums2[p2--];
        }

        while (p2 >= 0) {
            nums1[tail--] = nums2[p2--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{4, 5, 6};
        merge(nums1, 3, nums2, 3);
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
    }
}
