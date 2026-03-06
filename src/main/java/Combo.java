import java.util.ArrayList;
import java.util.List;

public class Combo {

    public static class Combinations {
        public static void main(String[] args) {
            int n = 2;
            int k = 1;
            System.out.println(combine(n, k));
        }

        public static List<List<Integer>> combine(int n, int k) {
            return backtrack(1, n, k, new ArrayList<>());
        }

        private static List<List<Integer>> backtrack(int start, int n, int k,
                                                     List<Integer> current) {
            List<List<Integer>> result = new ArrayList<>();
            if (current.size() == k) {
                result.add(new ArrayList<>(current));
                return result;
            }
            for (int i = start; i <= n; i++) {
                current.add(i);
                result.addAll(backtrack(i + 1, n, k, current));
                current.remove(current.size() - 1);
            }
            return result;
        }
    }
}
