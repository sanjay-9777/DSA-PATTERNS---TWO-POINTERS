
// Two Pointer
import java.util.Arrays;

public class TwoSum1 {
    public static void main(String[] args) {
        int arr[] = { 8, 7, 9, 2, 3 };
        int target = 15;
        Arrays.sort(arr);
        int i = 0, j = arr.length - 1;

        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == target) {
                System.out.println("Found: " + arr[i] + " + " + arr[j]);
                return;
            } else if (sum < target) {
                i++;
            } else if (sum > target) {
                j--;

            }
        }
    }
}
