package leetcode;

import java.util.Stack;

/**
 * @author yusx
 * @date 2021/3/10 4:33 下午
 */
public class LeetCode20 {
    /**
     * 有效的括号
     *  ()[]{} -> true
     *  ([)] -> false
     *
     * @param s
     * @return
     */
    public static boolean isValid(String s) {
        Stack<Character> leftStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                leftStack.push(s.charAt(i));
            }else{
                if (leftStack.isEmpty()){
                    return false;
                }
                if (getOther(leftStack.pop()) != s.charAt(i)){
                    return false;
                }
            }
        }
        return leftStack.isEmpty();

    }

    public static char getOther(Character ch){
        switch (ch){
            case '(':return ')';
            case '[':return ']';
            case '{':return '}';
        }
        return ' ';
    }

    public static void main(String[] args) {
        String s = "([)]";
        System.out.println(isValid(s));
    }
}
