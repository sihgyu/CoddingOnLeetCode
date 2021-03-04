package offer;

/**
 * @author yusx
 * @date 2021/3/4 2:39 下午
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
