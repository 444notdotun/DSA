import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MedianSorted {
    static void main() {
        int[] num1 = {1,3};
        int[] num2 ={2};
        IO.println(findMedianSortedArrays(num1, num2));

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = Stream.concat(
                Arrays.stream(nums1).boxed(),
                Arrays.stream(nums2).boxed()
        ).toList();
        List<Integer> sortedList= list.stream().sorted().toList();
        double median = 0;

        if(list.size() % 2 == 0){
            int meanDivider=sortedList.size()/2;
            int number1 =sortedList.get(meanDivider);
            int number2 =sortedList.get(meanDivider-1);
            median=(number2+number1)/2.0;
        }else{
            int meanDivider=sortedList.size()/2;
            median =sortedList.get(meanDivider);

        }
        return median;
    }
}
