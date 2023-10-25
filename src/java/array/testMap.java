package array;

import java.util.HashMap;
import java.util.Map;

public class testMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        Integer a = map.put("a", 1);
        System.out.println(a);
    }
}
