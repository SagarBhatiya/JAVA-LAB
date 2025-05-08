import java.util.*;

public class qs12 {
    // Making ArrayDemo static
    public static class ArrayDemo {

        // Method 1: Find all pairs with sum equal to given target
        void arrayFunc(int[] arr, int target) {
            System.out.println("Pairs of elements whose sum is " + target + " are:");
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] + arr[j] == target) {
                        System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                    }
                }
            }
        }

        // Method 2: Merge two sorted arrays into A and B maintaining order
        void arrayFunc(int[] A, int p, int[] B, int q) {
            int[] merged = new int[p + q];
            for (int i = 0; i < p; i++) merged[i] = A[i];
            for (int i = 0; i < q; i++) merged[p + i] = B[i];

            Arrays.sort(merged);  // Sort the combined array

            for (int i = 0; i < p; i++) A[i] = merged[i];
            for (int i = 0; i < q; i++) B[i] = merged[p + i];

            System.out.println("Sorted Arrays:");
            System.out.println("A: " + Arrays.toString(A));
            System.out.println("B: " + Arrays.toString(B));
        }
    }

    public static void main(String[] args) {
        ArrayDemo obj = new ArrayDemo();

        // Part 1: Find pairs with target sum
        int[] numbers = {4, 6, 5, -10, 8, 5, 20};
        int target = 10;
        obj.arrayFunc(numbers, target);

        // Part 2: Merge sorted arrays A and B
        int[] A = {1, 5, 6, 7, 8, 10};
        int[] B = {2, 4, 9};
        obj.arrayFunc(A, A.length, B, B.length);
    }
}
