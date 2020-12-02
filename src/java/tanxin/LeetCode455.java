package tanxin;

import java.util.Arrays;

/**
 * @author yusx
 * @date 2020/12/2 6:44 下午
 */
public class LeetCode455 {
    /*
    有一群孩子和一堆饼干，每个孩子有一个饥饿度，每个饼干都有一个大小。每个孩子只能吃
最多一个饼干，且只有饼干的大小大于孩子的饥饿度时，这个孩子才能吃饱。求解最多有多少孩
子可以吃饱。
    Input: [1,2], [1,2,3]
    Output: 2
     */
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int kid = 0,cookie=0;
        if (g.length == 0 || s.length == 0){
            return 0;
        }
        while (kid < g.length && cookie < s.length){
            if (g[kid] <= s[cookie]){
                kid ++;
            }
            cookie++;
        }
        return kid;
    }

    public static void main(String[] args) {
        int[] g = new int[]{1,2};
        int[] s = new int[]{1,2,3};
        System.out.println(findContentChildren(g,s));
    }
}

