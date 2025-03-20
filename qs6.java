import java.util.Scanner;

public class qs6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int firstPos = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                while (firstPos < n && arr[firstPos] < 0) {
                    firstPos++;
                }
                if (firstPos < n) {
                    int temp = arr[i];
                    arr[i] = arr[firstPos];
                    arr[firstPos] = temp;
                    firstPos++;
                }

            }
        }
        System.out.println("Rearranged array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}