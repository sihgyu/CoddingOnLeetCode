package array;

import java.util.ArrayList;
import java.util.List;

public class LeetCode78 {
    public static List<List<Integer>> enumerate(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res.add(new ArrayList<Integer>());
        for (Integer n : nums) {
            int size = res.size();
            for (int i = 0; i < size; i++) {
                // 遍历 追加  字节面试
                List<Integer> newSub = new ArrayList<Integer>(res.get(i));
                newSub.add(n);
                res.add(newSub);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3};
        System.out.println(enumerate(a));
    }
}
