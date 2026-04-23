// Two Pointer
// 167. Two Sum II - Input Array Is Sorted
// find the index
public class TwoSum2 {
    public static void main(String[] args) {
        int numbers[] = { 2, 7, 11, 15 };
        int target = 9;
        int i = 0, j = numbers.length - 1;

        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                System.out.println("Found at index: " + (i + 1) + " and " + (j + 1));
                break;      //for break the loop
            } else if (sum < target) {
                i++;
            } else if (sum > target) {
                j--;
            }

        }
    }
}
