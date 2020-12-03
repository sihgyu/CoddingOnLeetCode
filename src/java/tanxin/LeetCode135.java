package tanxin;

import java.util.Arrays;

/**
 * @author yusx
 * @date 2020/12/3 6:44 下午
 */
public class LeetCode135 {

    /**
     * 老师想给孩子们分发糖果，有 N 个孩子站成了一条直线，老师会根据每个孩子的表现，预先给他们评分。
     *
     * 你需要按照以下要求，帮助老师给这些孩子分发糖果：
     *
     * 每个孩子至少分配到 1 个糖果。
     * 相邻的孩子中，评分高的孩子必须获得更多的糖果。
     * 那么这样下来，老师至少需要准备多少颗糖果呢？
     *
     * 输入: [1,0,2]
     * 输出: 5
     * 解释: 你可以分别给这三个孩子分发 2、1、2 颗糖果。
     */
    public static int candy(int[] ratings) {
        // 剪枝 小于两个的直接返回长度
        if (ratings.length < 2) {
            return ratings.length;
        }
        int[] cake = new int[ratings.length];
        Arrays.fill(cake, 1);
        for (int m = 1; m < ratings.length; m++) {
            if (ratings[m] > ratings[m - 1]) {
                cake[m] = cake[m - 1] + 1;
            }
        }

        for (int n = ratings.length - 1; n > 0; n--) {
            if (ratings[n] < ratings[n - 1]) {
                cake[n - 1] = Math.max(cake[n - 1], cake[n] + 1);
            }
        }
        int result = 0;
        for (int j = 0; j < cake.length; j++) {
            result += cake[j];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] ratings = new int[]{1, 3, 2, 2, 1};
        System.out.println(candy(ratings));
    }
}
