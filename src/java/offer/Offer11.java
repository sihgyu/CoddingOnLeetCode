package offer;

/**
 * @author yusx
 * @date 2021/3/4 2:39 下午
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。  
 *
 * 示例 1：
 *
 * 输入：[3,4,5,1,2]
 * 输出：1
 * 示例 2：
 *
 * 输入：[2,2,2,0,1]
 * 输出：0
 */
public class Offer11 {
    public int minArray(int[] numbers) {
        if (numbers.length == 0) {
            return -1;
        }
        if (numbers.length == 1) {
            return numbers[0];
        }

        int flag = numbers[0];
        if (flag < numbers[numbers.length - 1]) {
            return flag;
        }
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < flag) {
                return numbers[i];
            }
            if (numbers[i] >= flag) {
                flag = numbers[i];
            }
        }
        return flag;
    }

    /**
     * 二分查找
     */
    public int minArray2(int[] numbers) {
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            int pivot = low + (high - low) / 2;
            if (numbers[pivot] < numbers[high]) {
                high = pivot;
            } else if (numbers[pivot] > numbers[high]) {
                low = pivot + 1;
            } else {
                high -= 1;
            }
        }
        return numbers[low];
    }

}
