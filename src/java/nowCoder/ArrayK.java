package nowCoder;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author :yusx
 * @date : 2023/11/6
 */
public class ArrayK {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        long pre = 0, cur;
        Map<Long, Integer> map = new HashMap<>();
        map.put(0L, 0);
        int ans = -1;
        for (int i = 1; i <= n; i++) {
            cur = pre + sc.nextInt() - k;
            if (map.containsKey(cur)) ans = Math.max(ans, i - map.get(cur));
            else map.put(cur, i);
            pre = cur;
        }
        System.out.println(ans);
    }

}
