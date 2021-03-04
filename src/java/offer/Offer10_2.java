package offer;

/**
 * @author yusx
 * @date 2021/3/4 2:28 下午
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
