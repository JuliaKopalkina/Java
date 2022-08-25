import java.util.Stack;

class Solution {
    public static void main(String args[]) {
        String path = "/home//foo/";
        System.out.println(simplifyPath(path));
    }

    public static String simplifyPath(String path) {
        Stack<String> strStack = new Stack<>();

        for (String str : path.split("/")) {
            if (str.equals("..")) {
                if (!strStack.isEmpty()) {
                    strStack.pop();
                }
            } 
            else if (!str.isEmpty() && !str.equals(".")) {
                strStack.push("/" + str);
            }

        }

        String str = "";

        while (!strStack.isEmpty()) {
            str = strStack.pop() + str;
        }
        return str.isEmpty() ? "/" : str;
    }
}