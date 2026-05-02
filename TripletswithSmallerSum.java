// Triplets with Smaller Sum

// Given an array arr[] of distinct integers and a value sum,
// find the count of triplets (i, j, k), having (i<j<k) with the 
// sum of (arr[i] + arr[j] + arr[k]) smaller than the given value sum.

import java.util.Arrays;

public class TripletswithSmallerSum {
    int countTri(int sum, int arr[]) {

        Arrays.sort(arr);
        int count = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            int j = i + 1;
            int k = arr.length - 1;
            while (j < k) {
                int target = arr[i] + arr[j] + arr[k];
                if (target < sum) {
                    count += (k - j);
                    j++;
                } else {
                    k--;
                }
            }

        }
        return count;
    }

    public static void main(String[] args) {
        TripletswithSmallerSum tss = new TripletswithSmallerSum();
        int arr[] = { -2, 0, 1, 3 };
        int sum = 2;
        int result = tss.countTri(sum, arr);
        System.out.println("Count of Triplets : " + result);
    }

}
