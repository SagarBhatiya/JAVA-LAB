import java.util.Scanner;

public class qs7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int svj = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i][j] < arr[i][svj]) {
                    svj = j;
                }
            }
            boolean found = true;
            for (int k = 0; k < m; k++) {
                if (arr[k][svj] > arr[i][svj]) {
                    found = false;
                }
            }
            if (found) {
                System.out.println(arr[i][svj]);
                break;
            }
        }

        sc.close();
    }
}