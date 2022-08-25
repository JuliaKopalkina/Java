
import java.util.ArrayDeque;

class Solution {

    public static void main(String args[]) {
        String s = "()";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        ArrayDeque<Character> ar = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                ar.push(ch);
                continue;
            }
            if (ch == ')' || ch == '}' || ch == ']') {
                if (ar.isEmpty()) {
                    return false;
                }
            }
            char top = ar.pop();
            switch (ch) {
                case ')':
                    if (top != '(') {
                        return false;
                    }
                    break;
                case '}':
                    if (top != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (top != '[') {
                        return false;
                    }
                    break;
            }
        }
        return ar.isEmpty();
    }
}
