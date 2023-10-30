import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        int[][] nums = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        print(nums);
        //[0,0] [0,1] [0,2]
        // [1,2] [2,2]
        // [1,0] [1,1] [2,1]
        // sql场景题  系统设计 编程题
        Lock lock = new ReentrantLock();
        lock.lock();

    }

    public static void print(int[][] nums) {
        int m = nums.length;
        int n = nums[0].length;
        int count = 0;
        int j = 0;
        for (int i = 0; ; i++) {
            for (j = i; j < n; j++) {
                count++;
                System.out.println(nums[i][j]);
            }
            if (count == n * m) {
                break;
            }
            for (j = i + 1; j < n - i; j++) {
                count++;
                System.out.println(nums[j][n - i - 1]);
            }


        }
    }
}
