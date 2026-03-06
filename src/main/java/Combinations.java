import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combinations {
    static void main() {
        int n = 2;
        int k = 1;
        System.out.println(combine(n, k));


    }
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        int [] range =  populateArray(n);
        if(n==1){
            for (int i = 0; i < range.length; i++) {
                for (int j = i + 1; j <=range.length; j++) {
                    if(range[i]==1) {
                        result.add(new ArrayList<>(List.of(range[i])));
                    }else {
                        result.add(new ArrayList<>(Arrays.asList(range[i], range[j])));
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n-1; j++) {
                result.add(new ArrayList<>(Arrays.asList(range[i], range[j])));
            }
        }
        return result;
    }

    public static int determineWays(int n, int k){
        int factorialOfN = getFactorialOfN(n);
        int factorialOfK=getFactorialOfK(k);
        int factorialOfKFromN = getFactorialOfKFromN(n, k);
        int resultOfKfromNAndK=factorialOfK*factorialOfKFromN;
        return factorialOfN/resultOfKfromNAndK;
    }

    public static int[] populateArray(int n){
        int [] range =  new int[n];
        int num =1;
        for(int i=0;i<n;i++){
            range[i]=num;
            num++;
        }
        return range;
    }

    private static int getFactorialOfKFromN(int n, int k) {
        int factorialOfKFromN=1;
        int z= n - k;
        for(int i=z; i>1; i--){
            factorialOfKFromN = factorialOfKFromN*i;
        }
        return factorialOfKFromN;
    }

    private static int getFactorialOfK(int k) {
        int  factorialOfK = 1;
        for(int i = k; i > 1; i--){
            factorialOfK = factorialOfK* k;
        }
        return factorialOfK;
    }

    private static int getFactorialOfN(int n) {
        int factorialOfN = 1;
        for(int i = n; i > 1; i--){
            factorialOfN = factorialOfN* n;
        }
        return factorialOfN;
    }


}
