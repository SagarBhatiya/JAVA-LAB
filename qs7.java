import java.util.Scanner;

public class qs7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter size of the row");
        int m = sc.nextInt();
        System.out.println("Enter size of the column");
        int n = sc.nextInt();
        
        
        int[][] arr = new int[m][n];
        System.out.println("Enter elements of the array");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        
       
        for (int i = 0; i < m; i++) {
            int minRow = arr[i][0];
            int minCol = 0;
            
            
            for (int j = 1; j < n; j++) {
                if (arr[i][j] < minRow) {
                    minRow = arr[i][j];
                    minCol = j;
                }
            }

            
            boolean isSaddlePoint = true;
            for (int k = 0; k < m; k++) {
                if (arr[k][minCol] > minRow) {
                    isSaddlePoint = false;
                    break;
                }
            }

            
            if (isSaddlePoint) {
                System.out.println("SaddlePoint "+arr[i][minCol]);
              
                break; 
            }
        }

        

        sc.close();
    }
}
