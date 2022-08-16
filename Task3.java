// Combinations

import java.util.List;
import java.util.ArrayList;;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(combine(4, 2));
    }

    public static List<List<Integer>> l2 = new ArrayList<List<Integer>>();

    public static void check(int a, int b, List<Integer> l, int k) {
        if (l.size() == k) {
            l2.add(new ArrayList<>(l));
            return;
        }

        for (int i = a + 1; i <= b; i++) {
            l.add(i);
            check(i, b, l, k);
            l.remove(l.size() - 1);
        }
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<Integer> l = new ArrayList<Integer>();

        check(0, n, l, k);
        return l2;
    }
}
