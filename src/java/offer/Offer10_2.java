package offer;

/**
 * @author yusx
 * @date 2021/3/4 2:28 下午
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 *
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 *
 * 示例 1：
 *
 * 输入：n = 2
 * 输出：2
 * 示例 2：
 *
 * 输入：n = 7
 * 输出：21
 * 示例 3：
 *
 * 输入：n = 0
 * 输出：1
 */
public class Offer10_2 {
    public int numWays(int n) {
        if (n == 0) {
            return 1;
        }
        int f0 = 1;
        int f1 = 1;
        int temp;
        for (int i = 2; i <= n; i++) {
            temp = f1 + f0;
            f0 = f1;
            f1 = temp % 1000000007;

        }
        return f1;
    }

}
