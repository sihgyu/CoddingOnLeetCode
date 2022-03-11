package array;

/**
 * @author yusx
 * @date 2022/3/9 6:48 下午
 */
public class LeetCode75 {

    // 递归使用快速排序,对arr[left...right]的范围进行排序
    private static void sort(Comparable[] arr, int left, int right) {

        // 对于小规模数组, 使用插入排序会更加快速
        if (right < left) {
            //自己实现插入排序
        }

        /* 随机在arr[l...r]的范围中, 选择一个数值作为标定点pivot*/
        swap(arr, left, (int) (Math.random() * (right - left + 1)) + left);

        Comparable v = arr[left];

        //设置边界值
        int lt = left;     // arr[left+1...lt] < v
        int gt = right + 1; // arr[gt...right] > v
        int i = left + 1;    // arr[lt+1...i) == v
        while (i < gt) {
            if (arr[i].compareTo(v) < 0) {
                swap(arr, i, lt + 1);
                i++;
                lt++;
            } else if (arr[i].compareTo(v) > 0) {
                swap(arr, i, gt - 1);
                gt--;
            } else { // arr[i] == v
                i++;
            }
        }

        swap(arr, left, lt);

        sort(arr, left, lt - 1);
        sort(arr, gt, right);
    }

    public static void sort(Comparable[] arr) {

        int n = arr.length;
        sort(arr, 0, n - 1);
    }

    //两值交换
    private static void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
