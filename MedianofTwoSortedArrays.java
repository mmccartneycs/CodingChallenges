import java.sql.Array;
import java.util.Arrays;

public class MedianofTwoSortedArrays {
    public static void main(String[] args){
        int m = 3;
        int n = 2;
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {4, 5, 6, 7};
        int[] arr = new int[nums1.length + nums2.length];

        for (int i = 0; i < nums1.length; i++) {
            arr[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            arr[nums1.length + i] = nums2[i];
        }
        Arrays.sort(arr);
        double median = arr[(arr.length/2)];

        if (arr.length%2 == 0){
            median = ((arr[(arr.length/2 - 1)] + arr[(arr.length/2)])/2.0);
        }
        System.out.println(median);



    }
}
/*
1) Median of Two Sorted Arrays
        Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
        The overall run time complexity should be O(log (m+n)).

        Example1:
        Input:nums1 = [1,3], nums2 = [2]
        Output:2.00000
        Explanation: merged array = [1,2,3] and median is 2.

        Example2:
        Input:nums1 = [1,2], nums2 = [3,4]
        Output:2.50000
        Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

        Constraints:


        nums1.length == m

        nums2.length == n

        0 <= m <= 1000

        0 <= n <= 1000

        1 <= m + n <= 2000

        -106 <= nums1[i], nums2[i] <= 106*/
