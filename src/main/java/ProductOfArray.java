import java.util.Arrays;

public class ProductOfArray {
    static void main() {
        int [] num= {-1,1,0,-3,3};
       IO.println(Arrays.toString(productOfArray(num)));

    }
    public static int[] productOfArray(int[] nums) {
        int multiple = 1;
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
          for(int j = 0; j < nums.length; j++){
              if(j!=i){
                  multiple *= nums[j];
              }
          }
          result[i] = multiple;
          multiple = 1;
        }
        return result;

    }
}
